// @SOURCE:/home/haukur/skil4_honn/RuPin/conf/routes
// @HASH:6d18298271bd0e2fdced0e2f22ac0a89a5e0fed2
// @DATE:Fri Nov 16 06:05:01 GMT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

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
                            

// @LINE:20
// @LINE:17
// @LINE:16
class ReverseSession {
    


 
// @LINE:17
def authenticate() = {
   Call("POST", "/login")
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
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

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
                            

// @LINE:20
// @LINE:17
// @LINE:16
class ReverseSession {
    


 
// @LINE:17
def authenticate = JavascriptReverseRoute(
   "controllers.Session.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
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
                            
}
                    


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

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
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                