
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

 """),_display_(Seq[Any](/*4.3*/stuff/*4.8*/.getName())),format.raw/*4.18*/("""

"""),_display_(Seq[Any](/*6.2*/for( pin <- stuff.getPins() ) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
    """),_display_(Seq[Any](/*7.6*/pin/*7.9*/.toString())),format.raw/*7.20*/("""
""")))})),format.raw/*8.2*/("""
<p>
      This is a test!
</p>
    """)))})))}
    }
    
    def render(stuff:is.ru.honn.rupin.domain.Board) = apply(stuff)
    
    def f:((is.ru.honn.rupin.domain.Board) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 18:48:54 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: f70cda8eef0a41c55487d96da0158a89a1673e09
                    MATRIX: 788->1|903->39|939->41|966->60|1005->62|1043->66|1055->71|1086->81|1123->84|1167->113|1206->115|1246->121|1256->124|1288->135|1320->137
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|35->6|35->6|35->6|36->7|36->7|36->7|37->8
                    -- GENERATED --
                */
            