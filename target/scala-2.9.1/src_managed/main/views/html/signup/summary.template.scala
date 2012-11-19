
package views.html.signup

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
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[is.ru.honn.rupin.domain.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: is.ru.honn.rupin.domain.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Account created!"), nav = "signup")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
    <h2>Your account:</h2>
    <p>Name: """),_display_(Seq[Any](/*5.15*/user/*5.19*/.getName())),format.raw/*5.29*/("""</p>
    <p>Username: """),_display_(Seq[Any](/*6.19*/user/*6.23*/.getUsername())),format.raw/*6.37*/("""</p>
    <p>Email: """),_display_(Seq[Any](/*7.16*/user/*7.20*/.getEmail())),format.raw/*7.31*/("""</p>
    Go here to: <a href=""""),_display_(Seq[Any](/*8.27*/routes/*8.33*/.Session.login)),format.raw/*8.47*/("""">Login</a>
""")))})))}
    }
    
    def render(user:is.ru.honn.rupin.domain.User) = apply(user)
    
    def f:((is.ru.honn.rupin.domain.User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 15:59:23 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/signup/summary.scala.html
                    HASH: 2243cb4700175317a26e7be752fd4fe3d5c68867
                    MATRIX: 786->1|899->37|936->40|990->86|1029->88|1106->130|1118->134|1149->144|1207->167|1219->171|1254->185|1309->205|1321->209|1353->220|1419->251|1433->257|1468->271
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8
                    -- GENERATED --
                */
            