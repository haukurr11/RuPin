package controllers;

/**
 * Created with IntelliJ IDEA.
 * Created by: The teachers
 * 13.11.2012 - 20.11.2012
 */

import is.ru.honn.rupin.domain.User;
import is.ru.honn.rupin.domain.UserRegistration;
import is.ru.honn.rupin.service.UsernameExistsException;
import play.data.Form;
import play.mvc.Result;
import views.html.signup.form;
import views.html.signup.summary;

/**
 * SignUp handles taking data from the Signup form and doing a few error checks
 * so that the user can be created without problems
 *
 */

public class SignUp extends RuPinController
{
    final static Form<UserRegistration> signupForm = form(UserRegistration.class);

    public static Result blank()
    {
        return ok(form.render(signupForm));
    }

    public static Result submit()
    {
        Form<UserRegistration> filledForm = signupForm.bindFromRequest();

        if (!"true".equals(filledForm.field("accept").value()))
            {
                filledForm.reject("accept", "You must accept the terms and conditions");
            }

        if (filledForm.field("username").value().length () < 4)
            filledForm.reject("username", "Username must be at least 4 characters");

        if (!filledForm.field("password").value().equals(filledForm.field("repeatPassword").value()))
            {
                filledForm.reject("repeatPassword", "Password does not match");
            }

        if (filledForm.hasErrors())
            {
                return badRequest(form.render(filledForm));
            }
        else
            {
                User created = filledForm.get();
                try
                    {
                        userService.signup(created);
                    }
                catch (UsernameExistsException e)
                    {
                        e.printStackTrace();
                    }
                return ok(summary.render(created));
            }
    }
}

