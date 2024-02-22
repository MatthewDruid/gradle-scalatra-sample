import org.scalatra.*
import jakarta.servlet.ServletContext
import com.example.MainServlet

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext): Unit = {
    context.mount(new MainServlet, "/*")
  }

  override def destroy(context: ServletContext): Unit = {
    super.destroy(context)
  }

}
