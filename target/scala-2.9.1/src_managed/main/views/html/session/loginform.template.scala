
package views.html.session

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object loginform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[is.ru.honn.rupin.domain.UserAuthentication],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[is.ru.honn.rupin.domain.UserAuthentication]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Login
""")))};
Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "login")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""

    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Session.authenticate)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
        <fieldset>
            <legend>Login</legend>
          """),_display_(Seq[Any](/*15.12*/inputText(
              loginForm("username"),
              '_label -> "Username"
          ))),format.raw/*18.12*/("""
          """),_display_(Seq[Any](/*19.12*/inputPassword(
                loginForm("password"),
                '_label -> "Password"
          ))),format.raw/*22.12*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn primary" value="Login">
            <a href=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Application.index)),format.raw/*27.47*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*29.6*/("""
""")))})))}
    }
    
    def render(loginForm:Form[is.ru.honn.rupin.domain.UserAuthentication]) = apply(loginForm)
    
    def f:((Form[is.ru.honn.rupin.domain.UserAuthentication]) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 16 06:05:02 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/session/loginform.scala.html
                    HASH: 716e9c511297181ad90ca5a0b3b048715ecbe33a
                    MATRIX: 809->1|980->117|992->122|1059->126|1110->62|1138->115|1165->138|1203->141|1238->167|1278->169|1320->176|1335->182|1387->225|1427->227|1529->293|1646->388|1694->400|1819->503|1997->645|2012->651|2052->669|2128->714
                    LINES: 27->1|32->6|32->6|34->6|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|44->12|44->12|47->15|50->18|51->19|54->22|59->27|59->27|59->27|61->29
                    -- GENERATED --
                */
            