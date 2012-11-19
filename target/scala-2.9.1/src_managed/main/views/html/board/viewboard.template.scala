
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
<input type="button" id="addpin" class="btn primary" value="Add Pin"
 action="http://mbl.is"
 onClick="window.location.href='../../createpin/"""),_display_(Seq[Any](/*8.50*/stuff/*8.55*/.getBoard().getCreator().getUsername())),format.raw/*8.93*/("""/"""),_display_(Seq[Any](/*8.95*/stuff/*8.100*/.getBoard().getName())),format.raw/*8.121*/("""'">
""")))})),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/for( pin <- stuff.getBoard().getPins() ) yield /*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*13.19*/pin/*13.22*/.getLink())),format.raw/*13.32*/("""">
        <img src=""""),_display_(Seq[Any](/*14.20*/pin/*14.23*/.getImage())),format.raw/*14.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*16.38*/pin/*16.41*/.getBoard().getCreator().getUsername())),format.raw/*16.79*/("""">"""),_display_(Seq[Any](/*16.82*/pin/*16.85*/.getBoard.getCreator().getName())),format.raw/*16.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*17.31*/routes/*17.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*18.34*/("""">"""),_display_(Seq[Any](/*18.37*/pin/*18.40*/.getBoard().getName())),format.raw/*18.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*19.28*/pin/*19.31*/.getDescription())),format.raw/*19.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*20.38*/pin/*20.41*/.getBoard().getCategory())),format.raw/*20.66*/("""</div>
    </div>
   """)))})),format.raw/*22.5*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.ViewBoardModel) = apply(stuff)
    
    def f:((viewmodels.ViewBoardModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 01:34:29 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: 1d06123fcf05dd6801906c4e5269f44bd4870caa
                    MATRIX: 784->1|895->35|931->37|958->56|997->58|1038->65|1051->70|1093->91|1134->98|1220->176|1259->178|1437->321|1450->326|1509->364|1546->366|1560->371|1603->392|1638->397|1676->400|1732->440|1772->442|1849->483|1861->486|1893->496|1951->518|1963->521|1996->532|2102->602|2114->605|2174->643|2213->646|2225->649|2280->681|2355->720|2370->726|2495->829|2534->832|2546->835|2589->856|2661->892|2673->895|2712->912|2792->956|2804->959|2851->984|2904->1006
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|34->5|34->5|34->5|37->8|37->8|37->8|37->8|37->8|37->8|38->9|40->11|40->11|40->11|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|47->18|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|51->22
                    -- GENERATED --
                */
            