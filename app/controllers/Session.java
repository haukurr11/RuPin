package controllers;

/**
 * Created with IntelliJ IDEA.
 * Created by: Haukur Rósinkranz, Knútur Óli Magnússon
 * 13.11.2012 - 20.11.2012
 */

import is.ru.honn.rupin.domain.User;
import is.ru.honn.rupin.domain.UserAuthentication;
import play.data.Form;
import play.mvc.Result;
import views.html.session.failedlogin;
import views.html.session.loginform;

/**
 * Session inherits the resources mapped in RuPinController
 * Session handles all the user actions related to the browser session
 * such as login() and logout()
 */

public class Session extends RuPinController
{

    final static Form<UserAuthentication> loginForm = form(UserAuthentication.class);

    public static Result login()
    {
        return ok(
                   loginform.render(form(UserAuthentication.class))
               );
    }

    public static Result authenticate()
    {
        Form<UserAuthentication> filledForm = loginForm.bindFromRequest();
        String username = filledForm.get().getUsername();
        String password = filledForm.get().getPassword();
        User user = userService.login(username, password);
        if( user == null || loginForm.hasErrors() )
            return ok(failedlogin.render());
        else
            {
                session("username", filledForm.get().getUsername());
                return redirect( routes.Application.index() );
            }
    }

    public static Result logout()
    {
        session().clear();
        flash("success", "You've been logged out");
        return redirect( routes.Session.login()  );
    }
}
