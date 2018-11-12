package me.beingyourself.gpacalculatorsrm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.MenuPopupWindow;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class myAct extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Spinner spin1;
    Spinner spin2;
    Spinner spin3;
    Spinner spin4;
    Spinner spin5;
    Spinner spin6;
    Spinner spin7;
    Spinner spin8;
    Spinner spin9;
    Spinner spin10;
    Spinner spin11;
    Spinner spin12;
    Spinner spin13;
    Spinner spin14;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    EditText e7;
    EditText e8;
    EditText e9;
    EditText e10;
    EditText e11;
    EditText e12;
    EditText e13;
    EditText e14;
    TextView gpa;
String check;
 String checkEdit;
    int sum;
    int j;
    int crd;
    int totalCrd;
    public void calculate(View v)
{
    sum=0;
    totalCrd=0;
 checkEdit=e1.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
       check= spin1.getItemAtPosition(spin1.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
       // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }

    //second

    checkEdit=e2.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin2.getItemAtPosition(spin2.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        //Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //third
    checkEdit=e3.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin3.getItemAtPosition(spin3.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //four

    checkEdit=e4.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin4.getItemAtPosition(spin4.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //five

    checkEdit=e5.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin5.getItemAtPosition(spin5.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //six
    checkEdit=e6.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin6.getItemAtPosition(spin6.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //sevrn

    checkEdit=e7.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin7.getItemAtPosition(spin7.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //eight
    checkEdit=e8.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin8.getItemAtPosition(spin8.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //nine
    checkEdit=e9.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin9.getItemAtPosition(spin9.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(checkw=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //ten
    checkEdit=e10.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin10.getItemAtPosition(spin10.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //11
    checkEdit=e11.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin11.getItemAtPosition(spin11.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //12
    checkEdit=e12.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin12.getItemAtPosition(spin12.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //13
    checkEdit=e13.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin13.getItemAtPosition(spin13.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }
    //14
    checkEdit=e14.getText().toString();
    if(checkEdit.matches("1")||checkEdit.matches("2")||checkEdit.matches("3")||checkEdit.matches("4"))
    {
        check= spin14.getItemAtPosition(spin14.getSelectedItemPosition()).toString();
        if(check=="O")
        {
            j=10;
        }
        else if(check=="A+")
        {
            j=9;
        }
        else if(check=="A")
        {
            j=8;
        }
        else if(check=="B+")
        {
            j=7;
        }
        else if(check=="B")
        {
            j=6;
        }
        else if(check=="C")
        {
            j=5;
        }
        else if(check=="P")
        {
            j=4;
        }
        crd=Integer.parseInt(checkEdit);
        sum=sum+j*crd;
        totalCrd+=crd;
        // Toast.makeText(getApplicationContext(),Integer.toString(sum),Toast.LENGTH_SHORT).show();

    }

    gpa=(TextView)findViewById(R.id.gpa);
    float a= (float) ((double)sum/totalCrd);
    gpa.setText(Float.toString(a));

}

public  void reset(View v)
{
    e1.setText("");
    e2.setText("");
    e3.setText("");
    e4.setText("");
    e5.setText("");
    e6.setText("");
    e7.setText("");
    e8.setText("");
    e9.setText("");
    e10.setText("");
    e11.setText("");
    e12.setText("");
    e13.setText("");
    e14.setText("");
    gpa=(TextView)findViewById(R.id.gpa);
    gpa.setText("");

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String number="2704046";
                //Intent i =new Intent(Intent.ACTION_CALL);
                //i.setData(Uri.parse("tel:"+number));

                    Intent i=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","shrey@qapaper.com",null));
                i.putExtra(Intent.EXTRA_SUBJECT,"Contact to admin");
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
          spin1=(Spinner)findViewById(R.id.spinner1);
        spin2=(Spinner)findViewById(R.id.spinner2);
        spin3=(Spinner)findViewById(R.id.spinner3);
        spin4=(Spinner)findViewById(R.id.spinner4);
        spin5=(Spinner)findViewById(R.id.spinner5);
        spin6=(Spinner)findViewById(R.id.spinner6);
        spin7=(Spinner)findViewById(R.id.spinner7);
        spin8=(Spinner)findViewById(R.id.spinner8);
        spin9=(Spinner)findViewById(R.id.spinner9);
        spin10=(Spinner)findViewById(R.id.spinner10);
        spin11=(Spinner)findViewById(R.id.spinner11);
        spin12=(Spinner)findViewById(R.id.spinner12);
        spin13=(Spinner)findViewById(R.id.spinner13);
        spin14=(Spinner)findViewById(R.id.spinner14);
        e1=(EditText)findViewById(R.id.first);
        e2=(EditText)findViewById(R.id.second);
        e3=(EditText)findViewById(R.id.third);
        e4=(EditText)findViewById(R.id.fourth);
        e5=(EditText)findViewById(R.id.fifth);
        e6=(EditText)findViewById(R.id.sixth);
        e7=(EditText)findViewById(R.id.seventh);
        e8=(EditText)findViewById(R.id.eight);
        e9=(EditText)findViewById(R.id.ninth);
        e10=(EditText)findViewById(R.id.tenth);
        e11=(EditText)findViewById(R.id.eleventhth);
        e12=(EditText)findViewById(R.id.twelfth);
        e13=(EditText)findViewById(R.id.thirteen);
        e14=(EditText)findViewById(R.id.fourteenth);


        List <String> l1=new ArrayList<String>();
        l1.add("O");
        l1.add("A+");
        l1.add("A");
        l1.add("B+");
        l1.add("B");
        l1.add("C");
        l1.add("P");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,l1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);
        spin3.setAdapter(adapter);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter);
        spin6.setAdapter(adapter);
        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter);
        spin9.setAdapter(adapter);
        spin10.setAdapter(adapter);
        spin11.setAdapter(adapter);
        spin12.setAdapter(adapter);
        spin13.setAdapter(adapter);
        spin14.setAdapter(adapter);




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.nav_manage) {
           Intent i=new Intent(this,About.class);
           startActivity(i);
        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
