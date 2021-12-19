public class NotificationView extends AppCompatActivity {
   TextView textView;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);setContentView(R.layout.activity_notification_view);textView = findViewById(R.id.text_message);
textView.setText(getIntent().getStringExtra("message"));}}

