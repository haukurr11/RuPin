
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>

       <div class="topbar">
            <div class="fill">
                <div class="container">
                           """),_display_(Seq[Any](/*17.29*/if(nav.equals("signup") || nav.equals("login") )/*17.77*/ {_display_(Seq[Any](format.raw/*17.79*/("""
                           <a href=""""),_display_(Seq[Any](/*18.38*/routes/*18.44*/.SignUp.blank)),format.raw/*18.57*/("""">Sign up</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*19.38*/routes/*19.44*/.Session.login)),format.raw/*19.58*/("""">Login</a>&nbsp;
                            """)))}/*20.30*/else/*20.35*/{_display_(Seq[Any](format.raw/*20.36*/("""
                           <a class="brand" href=""""),_display_(Seq[Any](/*21.52*/routes/*21.58*/.Application.index())),format.raw/*21.78*/("""">RuPin</a>&nbsp;
                           <a href=""""),_display_(Seq[Any](/*22.38*/routes/*22.44*/.Session.logout())),format.raw/*22.61*/("""">Sign out</a>&nbsp;
                """)))})),format.raw/*23.18*/("""
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*33.26*/title)),format.raw/*33.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*38.26*/content)),format.raw/*38.33*/("""
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
                    DATE: Fri Nov 16 06:05:02 GMT 2012
                    SOURCE: /home/haukur/skil4_honn/RuPin/app/views/main.scala.html
                    HASH: 5fd749392b7ea7dc28145894cb94c02f26fcd6d2
                    MATRIX: 764->1|887->47|1041->166|1055->172|1115->211|1211->272|1225->278|1278->310|1339->335|1354->341|1421->386|1643->572|1700->620|1740->622|1814->660|1829->666|1864->679|1957->736|1972->742|2008->756|2074->803|2087->808|2126->809|2214->861|2229->867|2271->887|2362->942|2377->948|2416->965|2486->1003|2716->1197|2743->1202|2909->1332|2938->1339
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|62->33|62->33|67->38|67->38
                    -- GENERATED --
                */
            