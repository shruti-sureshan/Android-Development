public class LocationActivity extends AppCompatActivity implements LocationListener {
   Button getLocationBtn;TextView locationText;LocationManager locationManager;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_location);
       getLocationBtn = findViewById(R.id.getLocationBtn);
       locationText = findViewById(R.id.locationText);
       if (ContextCompat.checkSelfPermission(getApplicationContext(),
               android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(),
               android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
           ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,
                   android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
       }getLocationBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {getLocation();}});}
   void getLocation() {try {locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, this);
       }catch(SecurityException e) {e.printStackTrace();}}
   @Override
   public void onLocationChanged(Location location) {
       locationText.setText("Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude());
       try {Geocoder geocoder = new Geocoder(this, Locale.getDefault());
           List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
           locationText.setText(locationText.getText() + "\n"+addresses.get(0).getAddressLine(0));
           Log.d("DEBUG", locationText.getText().toString());
       }catch(Exception e){}}
   @Override
   public void onProviderDisabled(String s) {
       Toast.makeText(this, "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();}}

