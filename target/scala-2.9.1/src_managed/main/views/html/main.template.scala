
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
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/addlike.js"))),format.raw/*13.65*/("""" type="text/javascript"></script>
    </head>
    <body>

       <div class="topbar">
            <div class="fill">
                <div class="container">
                           """),_display_(Seq[Any](/*20.29*/if(nav.equals("signup") || nav.equals("login") )/*20.77*/ {_display_(Seq[Any](format.raw/*20.79*/("""
                           <a href=""""),_display_(Seq[Any](/*21.38*/routes/*21.44*/.SignUp.blank)),format.raw/*21.57*/("""">Sign up</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*22.38*/routes/*22.44*/.Session.login)),format.raw/*22.58*/("""">Login</a>&nbsp;
                            """)))}/*23.30*/else/*23.35*/{_display_(Seq[Any](format.raw/*23.36*/("""
                           <a class="brand" href=""""),_display_(Seq[Any](/*24.52*/routes/*24.58*/.Application.index())),format.raw/*24.78*/("""">RuPin</a>&nbsp;
                           <a class="brand" href=""""),_display_(Seq[Any](/*25.52*/routes/*25.58*/.BoardController.myBoards())),format.raw/*25.85*/("""">My boards</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*26.38*/routes/*26.44*/.Session.logout())),format.raw/*26.61*/("""">Sign out</a>&nbsp;
                """)))})),format.raw/*27.18*/("""
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*37.26*/title)),format.raw/*37.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*42.26*/content)),format.raw/*42.33*/("""
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
                    DATE: Mon Nov 19 06:05:33 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/main.scala.html
                    HASH: 5e43b8095d3b72581e78e4fdfced0cce1c2baf79
                    MATRIX: 764->1|887->47|1041->166|1055->172|1115->211|1237->297|1252->303|1308->337|1406->399|1421->405|1475->437|1536->462|1551->468|1618->513|1711->570|1726->576|1784->612|2006->798|2063->846|2103->848|2177->886|2192->892|2227->905|2320->962|2335->968|2371->982|2437->1029|2450->1034|2489->1035|2577->1087|2592->1093|2634->1113|2739->1182|2754->1188|2803->1215|2898->1274|2913->1280|2952->1297|3022->1335|3252->1529|3279->1534|3445->1664|3474->1671
                    LINES: 27->1|30->1|37->8|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|66->37|66->37|71->42|71->42
                    -- GENERATED --
                */
            