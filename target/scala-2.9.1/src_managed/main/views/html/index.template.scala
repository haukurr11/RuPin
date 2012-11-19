
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
    
    <h2>Welcome! """),_display_(Seq[Any](/*4.19*/stuff/*4.24*/.getUser().getName())),format.raw/*4.44*/("""</h2>

"""),_display_(Seq[Any](/*6.2*/for( pin <- stuff.getPins() ) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*8.19*/pin/*8.22*/.getLink())),format.raw/*8.32*/("""">
        <img src=""""),_display_(Seq[Any](/*9.20*/pin/*9.23*/.getImage())),format.raw/*9.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by <a href="/user/"""),_display_(Seq[Any](/*11.38*/pin/*11.41*/.getBoard().getCreator().getUsername())),format.raw/*11.79*/("""">"""),_display_(Seq[Any](/*11.82*/pin/*11.85*/.getBoard.getCreator().getName())),format.raw/*11.117*/("""</a></p>
        <p>On board <a href=""""),_display_(Seq[Any](/*12.31*/routes/*12.37*/.BoardController.viewBoard(pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*13.34*/("""">"""),_display_(Seq[Any](/*13.37*/pin/*13.40*/.getBoard().getName())),format.raw/*13.61*/("""</a></p>
        <div class="desc">"""),_display_(Seq[Any](/*14.28*/pin/*14.31*/.getDescription())),format.raw/*14.48*/("""</div>
        <div class="desc">Category: """),_display_(Seq[Any](/*15.38*/pin/*15.41*/.getBoard().getCategory())),format.raw/*15.66*/("""</div>
    </div>
  """)))})),format.raw/*17.4*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.IndexModel) = apply(stuff)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 19 01:34:56 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: 96b39bbee0ed56f6a62a6df9bb61ae3507f5e5bb
                    MATRIX: 770->1|877->31|913->33|940->52|979->54|1038->78|1051->83|1092->103|1134->111|1178->140|1217->142|1293->183|1304->186|1335->196|1392->218|1403->221|1435->232|1541->302|1553->305|1613->343|1652->346|1664->349|1719->381|1794->420|1809->426|1934->529|1973->532|1985->535|2028->556|2100->592|2112->595|2151->612|2231->656|2243->659|2290->684|2342->705
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|40->11|40->11|40->11|40->11|41->12|41->12|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|46->17
                    -- GENERATED --
                */
            