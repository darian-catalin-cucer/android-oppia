import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.digitalcampus.oppia.model.Course
import org.digitalcampus.oppia.model.User
import org.digitalcampus.oppia.service.TrackerService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize user and course data
        val user = User("johndoe", "John Doe")
        val course = Course("course1", "Introduction to Kotlin")

        // Start the tracker service
        val trackerService = TrackerService(this, user, course)
        trackerService.startTracking()

        // Display user and course information in the UI
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "User: ${user.username}\nCourse: ${course.title}"
    }
}
