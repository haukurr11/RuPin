
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
object viewboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[$greater[$less[java.util.List, Object], <error>],play.api.templates.Html] {

    /**/
    def apply/*1.6*/(stuff: java.util.List<Object>):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""
    """),_display_(Seq[Any](/*2.6*/main(Html("RuPin"))/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""

    <p>
        This is a test!
    </p>
    """)))})))}
    }
    
    def render(stuff:$greater[$less[java.util.List, Object], <error>]) = apply(stuff)
    
    def f:(($greater[$less[java.util.List, Object], <error>]) => play.api.templates.Html) = (stuff) => apply(stuff)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 16 14:08:53 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/board/viewboard.scala.html
                    HASH: d2cf875e5f2db0d8329b293faa61a88712521917
                    MATRIX: 807->5|915->36|955->42|982->61|1021->63
                    LINES: 27->1|30->1|31->2|31->2|31->2
                    -- GENERATED --
                */
            