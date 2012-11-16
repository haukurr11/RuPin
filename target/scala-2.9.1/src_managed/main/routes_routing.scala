// @SOURCE:/home/haukur/skil4_honn/RuPin/conf/routes
// @HASH:6d18298271bd0e2fdced0e2f22ac0a89a5e0fed2
// @DATE:Fri Nov 16 06:05:01 GMT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:12
val controllers_SignUp_blank2 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:13
val controllers_SignUp_submit3 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:16
val controllers_Session_login4 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:17
val controllers_Session_authenticate5 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:20
val controllers_Session_logout6 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/signup""","""controllers.SignUp.blank()"""),("""POST""","""/signup""","""controllers.SignUp.submit()"""),("""GET""","""/login""","""controllers.Session.login()"""),("""POST""","""/login""","""controllers.Session.authenticate()"""),("""GET""","""/logout""","""controllers.Session.logout()"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_SignUp_blank2(params) => {
   call { 
        invokeHandler(_root_.controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil))
   }
}
                    

// @LINE:13
case controllers_SignUp_submit3(params) => {
   call { 
        invokeHandler(_root_.controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Nil))
   }
}
                    

// @LINE:16
case controllers_Session_login4(params) => {
   call { 
        invokeHandler(_root_.controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Nil))
   }
}
                    

// @LINE:17
case controllers_Session_authenticate5(params) => {
   call { 
        invokeHandler(_root_.controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Nil))
   }
}
                    

// @LINE:20
case controllers_Session_logout6(params) => {
   call { 
        invokeHandler(_root_.controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Nil))
   }
}
                    
}
    
}
                