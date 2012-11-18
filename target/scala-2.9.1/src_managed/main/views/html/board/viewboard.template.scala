
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
object viewboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[is.ru.honn.rupin.domain.Board,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(stuff: is.ru.honn.rupin.domain.Board):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""
"""),_display_(Seq[Any](/*2.2*/main(Html("RuPin"))/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""

 <h2>"""),_display_(Seq[Any](/*4.7*/stuff/*4.12*/.getName())),format.raw/*4.22*/("""</h2>

"""),_display_(Seq[Any](/*6.2*/for( pin <- stuff.getPins() ) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*8.19*/pin/*8.22*/.getLink())),format.raw/*8.32*/("""">
        <img src=""""),_display_(Seq[Any](/*9.20*/pin/*9.23*/.getImage())),format.raw/*9.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by """),_display_(Seq[Any](/*11.23*/pin/*11.26*/.getBoard().getCreator().getName())),format.raw/*11.60*/("""</p>
        <div class="desc">"""),_display_(Seq[Any](/*12.28*/pin/*12.31*/.getDescription())),format.raw/*12.48*/("""</div>
    </div>

""")))})),format.raw/*15.2*/("""
    """)))})))}
    }
    
    def render(stuff:is.ru.honn.rupin.domain.Board) = apply(stuff)
    
    def f:((is.ru.honn.rupin.domain.Board) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 18:58:54 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: d042295dba1b82ef1cd8b1e47a9e5a7d9628d598
                    MATRIX: 788->1|903->39|939->41|966->60|1005->62|1047->70|1060->75|1091->85|1133->93|1177->122|1216->124|1292->165|1303->168|1334->178|1391->200|1402->203|1434->214|1525->269|1537->272|1593->306|1661->338|1673->341|1712->358|1763->378
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|44->15
                    -- GENERATED --
                */
            