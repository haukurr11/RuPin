
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
object failedlogin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Login failed!"), nav = "login")/*1.44*/ {_display_(Seq[Any](format.raw/*1.46*/("""

    <a href=""""),_display_(Seq[Any](/*3.15*/routes/*3.21*/.Session.login)),format.raw/*3.35*/("""">Try again</a>
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 15:59:23 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/session/failedlogin.scala.html
                    HASH: 5028f665fc39094587e89ed62c53efb6f684041f
                    MATRIX: 842->1|892->43|931->45|982->61|996->67|1031->81
                    LINES: 30->1|30->1|30->1|32->3|32->3|32->3
                    -- GENERATED --
                */
            