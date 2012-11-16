
package views.html.board

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
object viewboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[viewmodels.IndexModel,play.api.templates.Html] {

    /**/
    def apply/*1.6*/(stuff: viewmodels.IndexModel):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
    """),_display_(Seq[Any](/*2.6*/main(Html("RuPin"))/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""

    <h2>Welcome! """),_display_(Seq[Any](/*4.19*/stuff/*4.24*/.getUser().getUsername())),format.raw/*4.48*/("""</h2>
    <p>
        This is a test!
    </p>
    """)))})))}
    }
    
    def render(stuff:viewmodels.IndexModel) = apply(stuff)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 16 18:37:15 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: 4439e7cc6ff37438e126d627ceec60e50860b592
                    MATRIX: 780->5|887->35|927->41|954->60|993->62|1048->82|1061->87|1106->111
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4
                    -- GENERATED --
                */
            