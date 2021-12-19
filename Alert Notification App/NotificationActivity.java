public class NotificationActivity extends AppCompatActivity {
   Button send;EditText text;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);     setContentView(R.layout.activity_notification);
       send = findViewById(R.id.send);text = findViewById(R.id.notify_text);
       send.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) { issueNotification(text.getText().toString().trim());}});}
   @RequiresApi(api = Build.VERSION_CODES.O)
   public void makeNotificationChannel(String id, String name, int importance)
   {NotificationChannel channel = new NotificationChannel(id, name, importance);
       channel.setShowBadge(true);NotificationManager notificationManager =
               (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
       assert notificationManager != null;      notificationManager.createNotificationChannel(channel);
   }
   public void issueNotification(String message)
   {if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           makeNotificationChannel("CHANNEL_1", "Example channel", NotificationManager.IMPORTANCE_DEFAULT);
       }Intent intent = new Intent(this, NotificationView.class);
       intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       intent.putExtra("message", message);PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
NotificationCompat.Builder notification = new NotificationCompat.Builder(this, "CHANNEL_1");notification.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Notification!").setContentText(message).setContentIntent(pendingIntent).setAutoCancel(true);NotificationManager notificationManager =
(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
assert notificationManager != null;notificationManager.notify(1, notification.build());}}
