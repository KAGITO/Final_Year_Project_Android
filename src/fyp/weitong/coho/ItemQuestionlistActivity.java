package fyp.weitong.coho;


import com.example.homeactivity.R;
import fyp.db.QuestionDB;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ItemQuestionlistActivity extends Activity {
	
	private EditText mEdtTitle ;
	private EditText mEdtContent;
	private Button mBtnSave;
	private Button mBtnDelete;
	private Question quetion;
	
	private String mOrgTitle;		// 原标题
	private String mOrgContent;		// 原内容
	private String mId;	
	String title;
	String content;
	private Question question; // 在数据库中的唯一id
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
		
		mEdtTitle = (EditText) findViewById(R.id.itemnote_title_edit);
		mEdtContent = (EditText) findViewById(R.id.itemnote_content_edit);
		
		mBtnSave = (Button) findViewById(R.id.itemnote_save);
		
		mBtnDelete = (Button) findViewById(R.id.itemnote_delete);
		
		
		Intent intent = getIntent();
		Question question = (Question) intent.getSerializableExtra("question");
		
		title = question.getTitle();
		content = question.getContent();
		TextView title222 = (TextView)findViewById(R.id.itemnote_title_edit);
        title222.setText(title);
        
        TextView content222 = (TextView)findViewById(R.id.itemnote_content_edit);
        content222.setText(content);
         
        
		// 如果是新建笔记，title，content，id均为null
	
		
		// 如果title和content不为为空，将其显示在控件中
				
	}
	

	
	
}
