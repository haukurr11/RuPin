
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
    def apply/*1.2*/(im: viewmodels.IndexModel):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""
"""),_display_(Seq[Any](/*2.2*/main(Html("RuPin"))/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
    <h2>Welcome! """),_display_(Seq[Any](/*3.19*/im/*3.21*/.getUser().getName())),format.raw/*3.41*/("""</h2>



"""),_display_(Seq[Any](/*7.2*/for( pin <- im.getPins() ) yield /*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*9.19*/pin/*9.22*/.getLink())),format.raw/*9.32*/("""">
        <img src=""""),_display_(Seq[Any](/*10.20*/pin/*10.23*/.getImage())),format.raw/*10.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*12.38*/pin/*12.41*/.getBoard().getCreator().getUsername())),format.raw/*12.79*/("""">"""),_display_(Seq[Any](/*12.82*/pin/*12.85*/.getBoard.getCreator().getName())),format.raw/*12.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*13.31*/routes/*13.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*14.34*/("""">"""),_display_(Seq[Any](/*14.37*/pin/*14.40*/.getBoard().getName())),format.raw/*14.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*15.28*/pin/*15.31*/.getDescription())),format.raw/*15.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*16.38*/pin/*16.41*/.getBoard().getCategory())),format.raw/*16.66*/("""</div>
        <div id="likes"""),_display_(Seq[Any](/*17.24*/pin/*17.27*/.getID)),format.raw/*17.33*/("""" >
        <button  class="button-like" onclick="addLike("""),_display_(Seq[Any](/*18.56*/pin/*18.59*/.getID)),format.raw/*18.65*/(""")"> Like</button>
            </div>
    </div>
   """)))})),format.raw/*21.5*/("""
""")))})),format.raw/*22.2*/("""

"""))}
    }
    
    def render(im:viewmodels.IndexModel) = apply(im)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (im) => apply(im)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 16:59:25 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: e4ab9c3fc9912093abfbbe39ef78bbd458212274
                    MATRIX: 770->1|874->28|910->30|937->49|976->51|1030->70|1040->72|1081->92|1125->102|1166->128|1205->130|1281->171|1292->174|1323->184|1381->206|1393->209|1426->220|1532->290|1544->293|1604->331|1643->334|1655->337|1710->369|1785->408|1800->414|1925->517|1964->520|1976->523|2019->544|2091->580|2103->583|2142->600|2222->644|2234->647|2281->672|2347->702|2359->705|2387->711|2482->770|2494->773|2522->779|2605->831|2638->833
                    LINES: 27->1|30->1|31->2|31->2|31->2|32->3|32->3|32->3|36->7|36->7|36->7|38->9|38->9|38->9|39->10|39->10|39->10|41->12|41->12|41->12|41->12|41->12|41->12|42->13|42->13|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|50->21|51->22
                    -- GENERATED --
                */
            