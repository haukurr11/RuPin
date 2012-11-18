
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
object viewboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[viewmodels.ViewBoardModel,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(stuff: viewmodels.ViewBoardModel):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*2.2*/main(Html("RuPin"))/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""

<h2>"""),_display_(Seq[Any](/*4.6*/stuff/*4.11*/.getBoard().getName())),format.raw/*4.32*/("""</h2>
"""),_display_(Seq[Any](/*5.2*/if(stuff.getUser().getUsername == stuff.getBoard().getCreator().getUsername())/*5.80*/ {_display_(Seq[Any](format.raw/*5.82*/("""
<button>Add Pin</button>
""")))})),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/for( pin <- stuff.getBoard().getPins() ) yield /*9.42*/ {_display_(Seq[Any](format.raw/*9.44*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*11.19*/pin/*11.22*/.getLink())),format.raw/*11.32*/("""">
        <img src=""""),_display_(Seq[Any](/*12.20*/pin/*12.23*/.getImage())),format.raw/*12.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by """),_display_(Seq[Any](/*14.23*/pin/*14.26*/.getBoard().getCreator().getName())),format.raw/*14.60*/("""</p>
        <p>On board <a href=""""),_display_(Seq[Any](/*15.31*/routes/*15.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*16.34*/("""">"""),_display_(Seq[Any](/*16.37*/pin/*16.40*/.getBoard().getName())),format.raw/*16.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*17.28*/pin/*17.31*/.getDescription())),format.raw/*17.48*/("""</div>
    </div>
   """)))})),format.raw/*19.5*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.ViewBoardModel) = apply(stuff)
    
    def f:((viewmodels.ViewBoardModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 20:27:16 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: b5e271901febba3900e5b1c61eb06362c8381b1e
                    MATRIX: 784->1|895->35|931->37|958->56|997->58|1038->65|1051->70|1093->91|1134->98|1220->176|1259->178|1316->205|1353->208|1408->248|1447->250|1524->291|1536->294|1568->304|1626->326|1638->329|1671->340|1762->395|1774->398|1830->432|1901->467|1916->473|2041->576|2080->579|2092->582|2135->603|2207->639|2219->642|2258->659|2311->681
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|34->5|34->5|34->5|36->7|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|45->16|45->16|45->16|45->16|46->17|46->17|46->17|48->19
                    -- GENERATED --
                */
            