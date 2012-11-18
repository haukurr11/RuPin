
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
    
    <h2>Welcome! """),_display_(Seq[Any](/*4.19*/stuff/*4.24*/.getUser().getUsername())),format.raw/*4.48*/("""</h2>
 """),_display_(Seq[Any](/*5.3*/for( pin <- stuff.getPins() ) yield /*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
    <div class="pin">
        <a href=""""),_display_(Seq[Any](/*7.19*/pin/*7.22*/.getLink())),format.raw/*7.32*/("""">
        <img src=""""),_display_(Seq[Any](/*8.20*/pin/*8.23*/.getImage())),format.raw/*8.34*/("""" alt="Pin image"/>
        </a>
        <p>Pinned by """),_display_(Seq[Any](/*10.23*/pin/*10.26*/.getBoard().getCreator().getName())),format.raw/*10.60*/("""</p>
        <div class="desc">"""),_display_(Seq[Any](/*11.28*/pin/*11.31*/.getDescription())),format.raw/*11.48*/("""</div>
    </div>
     """)))})),format.raw/*13.7*/("""

""")))})))}
    }
    
    def render(stuff:viewmodels.IndexModel) = apply(stuff)
    
    def f:((viewmodels.IndexModel) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 18:58:54 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/index.scala.html
                    HASH: 4c0abafddb92c9d08c2e8d45de357828d736190c
                    MATRIX: 770->1|877->31|913->33|940->52|979->54|1038->78|1051->83|1096->107|1138->115|1182->144|1221->146|1297->187|1308->190|1339->200|1396->222|1407->225|1439->236|1530->291|1542->294|1598->328|1666->360|1678->363|1717->380|1772->404
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|34->5|34->5|34->5|36->7|36->7|36->7|37->8|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|42->13
                    -- GENERATED --
                */
            