
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[viewmodels.IndexModel,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(stuff: viewmodels.IndexModel):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),_display_(Seq[Any](/*2.2*/main(Html("RuPin"))/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
    
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
                    DATE: Fri Nov 16 06:05:02 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: 3417947723540fc94bc59e1c43242537f25abf7f
                    MATRIX: 770->1|877->31|913->33|940->52|979->54|1038->78|1051->83|1096->107
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4
                    -- GENERATED --
                */
            