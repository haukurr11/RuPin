
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
        <p>Pinned by """),_display_(Seq[Any](/*11.23*/pin/*11.26*/.getBoard().getCreator().getName())),format.raw/*11.60*/("""</p>
        <p>On board
        <a href=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.BoardController.viewBoard(
        pin.getBoard().getCreator().getUsername(),
        pin.getBoard().getName()))),format.raw/*15.34*/("""">"""),_display_(Seq[Any](/*15.37*/pin/*15.40*/.getBoard().getName())),format.raw/*15.61*/("""
        </a></p>
        <p>In category:
        """),_display_(Seq[Any](/*18.10*/pin/*18.13*/.getBoard().getCategory())),format.raw/*18.38*/("""</p>
        <div class="desc">"""),_display_(Seq[Any](/*19.28*/pin/*19.31*/.getDescription())),format.raw/*19.48*/("""</div>
    </div>
  """)))})),format.raw/*21.4*/("""
""")))})))}
    }
    
    def render(stuff:viewmodels.IndexModel) = apply(stuff)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 21:18:32 GMT 2012
                    SOURCE: C:/Users/RuPin/app/views/index.scala.html
                    HASH: cb432a792bc9f480f61983131d97f964855c68f8
                    MATRIX: 770->1|877->31|913->33|940->52|979->54|1038->78|1051->83|1092->103|1134->111|1178->140|1217->142|1293->183|1304->186|1335->196|1392->218|1403->221|1435->232|1526->287|1538->290|1594->324|1673->367|1688->373|1822->485|1861->488|1873->491|1916->512|2003->563|2015->566|2062->591|2130->623|2142->626|2181->643|2233->664
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|40->11|42->13|42->13|44->15|44->15|44->15|44->15|47->18|47->18|47->18|48->19|48->19|48->19|50->21
                    -- GENERATED --
                */
            