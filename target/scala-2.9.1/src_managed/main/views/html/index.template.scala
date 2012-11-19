
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


"""),_display_(Seq[Any](/*6.2*/for( pin <- im.getPins() ) yield /*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*8.19*/pin/*8.22*/.getLink())),format.raw/*8.32*/("""">
        <img src=""""),_display_(Seq[Any](/*9.20*/pin/*9.23*/.getImage())),format.raw/*9.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*11.38*/pin/*11.41*/.getBoard().getCreator().getUsername())),format.raw/*11.79*/("""">"""),_display_(Seq[Any](/*11.82*/pin/*11.85*/.getBoard.getCreator().getName())),format.raw/*11.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*12.31*/routes/*12.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*13.34*/("""">"""),_display_(Seq[Any](/*13.37*/pin/*13.40*/.getBoard().getName())),format.raw/*13.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*14.28*/pin/*14.31*/.getDescription())),format.raw/*14.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*15.38*/pin/*15.41*/.getBoard().getCategory())),format.raw/*15.66*/("""</div>
        <div id="likes"""),_display_(Seq[Any](/*16.24*/pin/*16.27*/.getID)),format.raw/*16.33*/("""" >
        <button class="btn primary" onclick="addLike("""),_display_(Seq[Any](/*17.55*/pin/*17.58*/.getID)),format.raw/*17.64*/(""")">Like</button>
            </div>
    </div>
   """)))})),format.raw/*20.5*/("""
""")))})),format.raw/*21.2*/("""

"""))}
    }
    
    def render(im:viewmodels.IndexModel) = apply(im)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (im) => apply(im)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 06:06:00 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: de0960a8540cebcdf90decdfc92d725f829e579e
                    MATRIX: 770->1|874->28|910->30|937->49|976->51|1030->70|1040->72|1081->92|1124->101|1165->127|1204->129|1280->170|1291->173|1322->183|1379->205|1390->208|1422->219|1528->289|1540->292|1600->330|1639->333|1651->336|1706->368|1781->407|1796->413|1921->516|1960->519|1972->522|2015->543|2087->579|2099->582|2138->599|2218->643|2230->646|2277->671|2343->701|2355->704|2383->710|2477->768|2489->771|2517->777|2599->828|2632->830
                    LINES: 27->1|30->1|31->2|31->2|31->2|32->3|32->3|32->3|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|40->11|40->11|40->11|40->11|41->12|41->12|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|49->20|50->21
                    -- GENERATED --
                */
            