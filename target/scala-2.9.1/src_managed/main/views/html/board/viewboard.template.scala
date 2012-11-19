
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
<a href="createpin" <button>Add Pin</button>
""")))})),format.raw/*7.2*/("""
"""),_display_(Seq[Any](/*8.2*/request()/*8.11*/.headers().values().size())),format.raw/*8.37*/("""
"""),_display_(Seq[Any](/*9.2*/request()/*9.11*/.body().asText())),format.raw/*9.27*/("""


"""),_display_(Seq[Any](/*12.2*/request()/*12.11*/.body().asJson())),format.raw/*12.27*/("""
"""),_display_(Seq[Any](/*13.2*/for( pin <- stuff.getBoard().getPins() ) yield /*13.42*/ {_display_(Seq[Any](format.raw/*13.44*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*15.19*/pin/*15.22*/.getLink())),format.raw/*15.32*/("""">
        <img src=""""),_display_(Seq[Any](/*16.20*/pin/*16.23*/.getImage())),format.raw/*16.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by """),_display_(Seq[Any](/*18.23*/pin/*18.26*/.getBoard().getCreator().getName())),format.raw/*18.60*/("""</p>
        <p>On board <a href=""""),_display_(Seq[Any](/*19.31*/routes/*19.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*20.34*/("""">"""),_display_(Seq[Any](/*20.37*/pin/*20.40*/.getBoard().getName())),format.raw/*20.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*21.28*/pin/*21.31*/.getDescription())),format.raw/*21.48*/("""</div>
    </div>
   """)))})),format.raw/*23.5*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.ViewBoardModel) = apply(stuff)
    
    def f:((viewmodels.ViewBoardModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 22:53:20 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: 058705480bef7924463a64367ded5b0ba3b7c77c
                    MATRIX: 784->1|895->35|931->37|958->56|997->58|1038->65|1051->70|1093->91|1134->98|1220->176|1259->178|1336->225|1372->227|1389->236|1436->262|1472->264|1489->273|1526->289|1565->293|1583->302|1621->318|1658->320|1714->360|1754->362|1831->403|1843->406|1875->416|1933->438|1945->441|1978->452|2069->507|2081->510|2137->544|2208->579|2223->585|2348->688|2387->691|2399->694|2442->715|2514->751|2526->754|2565->771|2618->793
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|34->5|34->5|34->5|36->7|37->8|37->8|37->8|38->9|38->9|38->9|41->12|41->12|41->12|42->13|42->13|42->13|44->15|44->15|44->15|45->16|45->16|45->16|47->18|47->18|47->18|48->19|48->19|49->20|49->20|49->20|49->20|50->21|50->21|50->21|52->23
                    -- GENERATED --
                */
            