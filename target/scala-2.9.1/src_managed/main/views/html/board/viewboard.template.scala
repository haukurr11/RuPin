
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
    def apply/*1.2*/(vbm: viewmodels.ViewBoardModel):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),_display_(Seq[Any](/*2.2*/main(Html("RuPin"))/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""

<h2>"""),_display_(Seq[Any](/*4.6*/vbm/*4.9*/.getBoard().getName())),format.raw/*4.30*/("""</h2>
"""),_display_(Seq[Any](/*5.2*/if(vbm.getUser().getUsername == vbm.getBoard().getCreator().getUsername())/*5.76*/ {_display_(Seq[Any](format.raw/*5.78*/("""
<input type="button" id="addpin" class="btn primary" value="Add Pin"
 onClick="window.location.href='../../createpin/"""),_display_(Seq[Any](/*7.50*/vbm/*7.53*/.getBoard().getCreator().getUsername())),format.raw/*7.91*/("""/"""),_display_(Seq[Any](/*7.93*/vbm/*7.96*/.getBoard().getName())),format.raw/*7.117*/("""'">
""")))})),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/for( pin <- vbm.getBoard().getPins() ) yield /*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*12.19*/pin/*12.22*/.getLink())),format.raw/*12.32*/("""">
        <img src=""""),_display_(Seq[Any](/*13.20*/pin/*13.23*/.getImage())),format.raw/*13.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*15.38*/pin/*15.41*/.getBoard().getCreator().getUsername())),format.raw/*15.79*/("""">"""),_display_(Seq[Any](/*15.82*/pin/*15.85*/.getBoard.getCreator().getName())),format.raw/*15.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*16.31*/routes/*16.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*17.34*/("""">"""),_display_(Seq[Any](/*17.37*/pin/*17.40*/.getBoard().getName())),format.raw/*17.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*18.28*/pin/*18.31*/.getDescription())),format.raw/*18.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*19.38*/pin/*19.41*/.getBoard().getCategory())),format.raw/*19.66*/("""</div>
        <div id="likes"""),_display_(Seq[Any](/*20.24*/pin/*20.27*/.getID)),format.raw/*20.33*/("""" >
        <button  class="button-like" onclick="addLike("""),_display_(Seq[Any](/*21.56*/pin/*21.59*/.getID)),format.raw/*21.65*/(""")"> Like</button>
            </div>
    </div>
   """)))})),format.raw/*24.5*/("""
""")))})),format.raw/*25.2*/("""

"""))}
    }
    
    def render(vbm:viewmodels.ViewBoardModel) = apply(vbm)
    
    def f:((viewmodels.ViewBoardModel) => play.api.templates.Html) = (vbm) => apply(vbm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 15:13:10 GMT 2012
                    SOURCE: C:/Users/RuPin/app/views/board/viewboard.scala.html
                    HASH: 7227f6560a02a71d57e4efd77001b54151d81ca5
                    MATRIX: 784->1|893->33|929->35|956->54|995->56|1036->63|1046->66|1088->87|1129->94|1211->168|1250->170|1404->289|1415->292|1474->330|1511->332|1522->335|1565->356|1600->361|1638->364|1692->402|1732->404|1809->445|1821->448|1853->458|1911->480|1923->483|1956->494|2062->564|2074->567|2134->605|2173->608|2185->611|2240->643|2315->682|2330->688|2455->791|2494->794|2506->797|2549->818|2621->854|2633->857|2672->874|2752->918|2764->921|2811->946|2877->976|2889->979|2917->985|3012->1044|3024->1047|3052->1053|3135->1105|3168->1107
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|34->5|34->5|34->5|36->7|36->7|36->7|36->7|36->7|36->7|37->8|39->10|39->10|39->10|41->12|41->12|41->12|42->13|42->13|42->13|44->15|44->15|44->15|44->15|44->15|44->15|45->16|45->16|46->17|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|53->24|54->25
                    -- GENERATED --
                */
            