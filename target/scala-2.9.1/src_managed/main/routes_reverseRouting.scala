// @SOURCE:/home/haukur/skil4_honn/RuPin/conf/routes
// @HASH:40407affdaf1c235e1bdb67495289f9be69e8c9f
// @DATE:Sat Nov 17 18:17:10 GMT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:13
// @LINE:12
class ReverseSignUp {
    


 
// @LINE:13
def submit() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:12
def blank() = {
   Call("GET", "/signup")
}
                                                        

                      
    
}
                            

// @LINE:24
class ReverseBoardController {
    


 
// @LINE:24
def viewBoard(username:String, boardname:String) = {
   Call("GET", "/board/viewboard/" + implicitly[PathBindable[String]].unbind("username", username) + "/" + implicitly[PathBindable[String]].unbind("boardname", boardname))
}
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:20
// @LINE:17
// @LINE:16
class ReverseSession {
    


 
// @LINE:25
// @LINE:17
def authenticate() = {
   () match {
// @LINE:17
case () if true => Call("POST", "/login")
                                                                
// @LINE:25
case () if true => Call("POST", "/login")
                                                                    
   }
}
                                                        
 
// @LINE:20
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:16
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
// @LINE:12
class ReverseSignUp {
    


 
// @LINE:13
def submit = JavascriptReverseRoute(
   "controllers.SignUp.submit",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:12
def blank = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:24
class ReverseBoardController {
    


 
// @LINE:24
def viewBoard = JavascriptReverseRoute(
   "controllers.BoardController.viewBoard",
   """
      function(username,boardname) {
      return _wA({method:"GET", url:"/board/viewboard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", username) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("boardname", boardname)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:20
// @LINE:17
// @LINE:16
class ReverseSession {
    


 
// @LINE:25
// @LINE:17
def authenticate = JavascriptReverseRoute(
   "controllers.Session.authenticate",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"/login"})
      }
      if (true) {
      return _wA({method:"POST", url:"/login"})
      }
      }
   """
)
                                                        
 
// @LINE:20
def logout = JavascriptReverseRoute(
   "controllers.Session.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:16
def login = JavascriptReverseRoute(
   "controllers.Session.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:13
// @LINE:12
class ReverseSignUp {
    


 
// @LINE:13
def submit() = new play.api.mvc.HandlerRef(
   controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Seq())
)
                              
 
// @LINE:12
def blank() = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq())
)
                              

                      
    
}
                            

// @LINE:24
class ReverseBoardController {
    


 
// @LINE:24
def viewBoard(username:String, boardname:String) = new play.api.mvc.HandlerRef(
   controllers.BoardController.viewBoard(username, boardname), HandlerDef(this, "controllers.BoardController", "viewBoard", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:25
// @LINE:20
// @LINE:17
// @LINE:16
class ReverseSession {
    


 
// @LINE:17
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Seq())
)
                              
 
// @LINE:20
def logout() = new play.api.mvc.HandlerRef(
   controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Seq())
)
                              
 
// @LINE:16
def login() = new play.api.mvc.HandlerRef(
   controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            
}
                    
                