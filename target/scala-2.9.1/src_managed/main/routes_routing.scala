// @SOURCE:/home/haukur/skil4_honn/RuPin/conf/routes
// @HASH:69c45b437dc2a8181e0d3da7df723341d564ac3d
// @DATE:Sun Nov 18 20:06:52 GMT 2012

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
                    

// @LINE:23
val controllers_BoardController_viewBoard7 = Route("GET", PathPattern(List(StaticPart("/board/view/"),DynamicPart("username", """[^/]+"""),StaticPart("/"),DynamicPart("boardname", """[^/]+"""))))
                    

// @LINE:24
val controllers_BoardController_myBoards8 = Route("GET", PathPattern(List(StaticPart("/board/myboards"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/signup""","""controllers.SignUp.blank()"""),("""POST""","""/signup""","""controllers.SignUp.submit()"""),("""GET""","""/login""","""controllers.Session.login()"""),("""POST""","""/login""","""controllers.Session.authenticate()"""),("""GET""","""/logout""","""controllers.Session.logout()"""),("""GET""","""/board/view/$username<[^/]+>/$boardname<[^/]+>""","""controllers.BoardController.viewBoard(username:String, boardname:String)"""),("""GET""","""/board/myboards""","""controllers.BoardController.myBoards()"""))
             
    
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
                    

// @LINE:23
case controllers_BoardController_viewBoard7(params) => {
   call(params.fromPath[String]("username", None), params.fromPath[String]("boardname", None)) { (username, boardname) =>
        invokeHandler(_root_.controllers.BoardController.viewBoard(username, boardname), HandlerDef(this, "controllers.BoardController", "viewBoard", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:24
case controllers_BoardController_myBoards8(params) => {
   call { 
        invokeHandler(_root_.controllers.BoardController.myBoards(), HandlerDef(this, "controllers.BoardController", "myBoards", Nil))
   }
}
                    
}
    
}
                