package controllers;

import is.ru.honn.rupin.domain.User;
import is.ru.honn.rupin.domain.UserAuthentication;
import play.data.Form;
import play.mvc.Result;
import views.html.session.failedlogin;
import views.html.session.loginform;


public class Session extends RuPinController {

  final static Form<UserAuthentication> loginForm = form(UserAuthentication.class);
    /**
     * Login page.
     */
    public static Result login() {
        return ok(
                loginform.render(form(UserAuthentication.class))
        );
    }

    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
        Form<UserAuthentication> filledForm = loginForm.bindFromRequest();
        String username = filledForm.get().getUsername();
        String password = filledForm.get().getPassword();
        User user = userService.login(username,password);
        if( user == null || loginForm.hasErrors() )
            return ok(failedlogin.render());
        else {
            session("username", filledForm.get().getUsername());
            return redirect( routes.Application.index() );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect( routes.Session.login()  );
    }
}
