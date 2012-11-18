
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>RuPin</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" type="text/css" media="screen"
              href=""""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("stylesheets/main.css"))),format.raw/*10.62*/(""""/>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    </head>
    <body>

       <div class="topbar">
            <div class="fill">
                <div class="container">
                           """),_display_(Seq[Any](/*19.29*/if(nav.equals("signup") || nav.equals("login") )/*19.77*/ {_display_(Seq[Any](format.raw/*19.79*/("""
                           <a href=""""),_display_(Seq[Any](/*20.38*/routes/*20.44*/.SignUp.blank)),format.raw/*20.57*/("""">Sign up</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*21.38*/routes/*21.44*/.Session.login)),format.raw/*21.58*/("""">Login</a>&nbsp;
                            """)))}/*22.30*/else/*22.35*/{_display_(Seq[Any](format.raw/*22.36*/("""
                           <a class="brand" href=""""),_display_(Seq[Any](/*23.52*/routes/*23.58*/.Application.index())),format.raw/*23.78*/("""">RuPin</a>&nbsp;
                           <a class="brand" href=""""),_display_(Seq[Any](/*24.52*/routes/*24.58*/.BoardController.myBoards())),format.raw/*24.85*/("""">My boards</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*25.38*/routes/*25.44*/.Session.logout())),format.raw/*25.61*/("""">Sign out</a>&nbsp;
                """)))})),format.raw/*26.18*/("""
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*36.26*/title)),format.raw/*36.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*41.26*/content)),format.raw/*41.33*/("""
                    </div>
                </div>

            </div>

            <footer>
                <p>
                    RuPin 2012
                </p>
            </footer>

        </div>

    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 20:17:16 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/main.scala.html
                    HASH: 9445c0e0e4fc5c6983b820c455dc7bc10275355c
                    MATRIX: 764->1|887->47|1041->166|1055->172|1115->211|1237->297|1252->303|1308->337|1406->399|1421->405|1475->437|1536->462|1551->468|1618->513|1840->699|1897->747|1937->749|2011->787|2026->793|2061->806|2154->863|2169->869|2205->883|2271->930|2284->935|2323->936|2411->988|2426->994|2468->1014|2573->1083|2588->1089|2637->1116|2732->1175|2747->1181|2786->1198|2856->1236|3086->1430|3113->1435|3279->1565|3308->1572
                    LINES: 27->1|30->1|37->8|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|65->36|65->36|70->41|70->41
                    -- GENERATED --
                */
            