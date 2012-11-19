
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
    <h2>Welcome! """),_display_(Seq[Any](/*3.19*/stuff/*3.24*/.getUser().getName())),format.raw/*3.44*/("""</h2>
"""),_display_(Seq[Any](/*4.2*/for( pin <- stuff.getPins() ) yield /*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*6.19*/pin/*6.22*/.getLink())),format.raw/*6.32*/("""">
        <img src=""""),_display_(Seq[Any](/*7.20*/pin/*7.23*/.getImage())),format.raw/*7.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*9.38*/pin/*9.41*/.getBoard().getCreator().getUsername())),format.raw/*9.79*/("""">"""),_display_(Seq[Any](/*9.82*/pin/*9.85*/.getBoard.getCreator().getName())),format.raw/*9.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*11.34*/("""">"""),_display_(Seq[Any](/*11.37*/pin/*11.40*/.getBoard().getName())),format.raw/*11.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*12.28*/pin/*12.31*/.getDescription())),format.raw/*12.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*13.38*/pin/*13.41*/.getBoard().getCategory())),format.raw/*13.66*/("""</div>
    </div>
  """)))})),format.raw/*15.4*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.IndexModel) = apply(stuff)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 01:39:19 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: 0f89206eedda085e60c8d0a3f5c85022e67f0d30
                    MATRIX: 770->1|877->31|913->33|940->52|979->54|1033->73|1046->78|1087->98|1128->105|1172->134|1211->136|1287->177|1298->180|1329->190|1386->212|1397->215|1429->226|1534->296|1545->299|1604->337|1642->340|1653->343|1707->375|1782->414|1797->420|1922->523|1961->526|1973->529|2016->550|2088->586|2100->589|2139->606|2219->650|2231->653|2278->678|2330->699
                    LINES: 27->1|30->1|31->2|31->2|31->2|32->3|32->3|32->3|33->4|33->4|33->4|35->6|35->6|35->6|36->7|36->7|36->7|38->9|38->9|38->9|38->9|38->9|38->9|39->10|39->10|40->11|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|44->15
                    -- GENERATED --
                */
            