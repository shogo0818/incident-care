import com.example.incident.care.controller.BulletinBoardController
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TopPageController(private val bulletinBoardController: BulletinBoardController) { // BulletinBoardController を挿入する

    @GetMapping("/top")
    fun showTopPage(model: Model): String {
        val bulletinPosts = bulletinBoardController.getBulletinPosts() // 掲示板の投稿を取得する
        model.addAttribute("bulletinPosts", bulletinPosts) //モデルにポストを追加する
        return "top" // 掲示板データを使用して top.html テンプレートをレンダリングします。
    }
}

