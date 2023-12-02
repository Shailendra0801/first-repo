package com.example.projectone

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import com.example.projectone.ui.theme.ProjectOneTheme
import android.Manifest
import android.app.Activity
import android.util.Log
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



//        setContentView(R.layout.constraint)
//        val apply = findViewById<Button>(R.id.btnApply)
//        apply.setOnClickListener {
//            val firstName = findViewById<EditText>(R.id.editTextFname)
//            val fNm = firstName.text.toString()
//            val lastName = findViewById<EditText>(R.id.editTextLname)
//            val lNm = lastName.text.toString()
//            val DOB = findViewById<EditText>(R.id.editTextDOB)
//            val dob = DOB.text.toString()
//            val Country = findViewById<EditText>(R.id.editTextCountry)
//            val Cnt = Country.text.toString()
//
//            Log.d("Main Activity", "$fNm $lNm born on $dob from $Cnt applied today!!!")
//        }



//        setContentView(R.layout.text_vieww)
//
//        var countt = 0
//        val count = findViewById<Button>(R.id.btnCount)
//        count.setOnClickListener {
//            countt++
//            val show = findViewById<TextView>(R.id.textViewCounter)
//            show.text = "Let's count together: $countt"
//        }



//        setContentView(R.layout.edit_textt)
//
//        val add = findViewById<Button>(R.id.btnAdd)
//
//        add.setOnClickListener {
//            val fNo = findViewById<EditText>(R.id.editTextFnumber).text.toString().toInt()
//            val sNo = findViewById<EditText>(R.id.editTextSnumber).text.toString().toInt()
//            val Result = findViewById<TextView>(R.id.textViewResult)
//            Result.text = "${fNo+sNo}"
//
//        }
//        val sub = findViewById<Button>(R.id.btnSub)
//
//        sub.setOnClickListener {
//            val fNo = findViewById<EditText>(R.id.editTextFnumber).text.toString().toInt()
//            val sNo = findViewById<EditText>(R.id.editTextSnumber).text.toString().toInt()
//            val Result = findViewById<TextView>(R.id.textViewResult)
//            Result.text = "${fNo-sNo}"
//
//        }
//        val mul = findViewById<Button>(R.id.btnMul)
//
//        mul.setOnClickListener {
//            val fNo = findViewById<EditText>(R.id.editTextFnumber).text.toString().toInt()
//            val sNo = findViewById<EditText>(R.id.editTextSnumber).text.toString().toInt()
//            val Result = findViewById<TextView>(R.id.textViewResult)
//            Result.text = "${fNo*sNo}"
//
//        }
//        val div = findViewById<Button>(R.id.btnDiv)
//
//        div.setOnClickListener {
//            val fNo = findViewById<EditText>(R.id.editTextFnumber).text.toString().toInt()
//            val sNo = findViewById<EditText>(R.id.editTextSnumber).text.toString().toInt()
//            val Result = findViewById<TextView>(R.id.textViewResult)
//            Result.text = "${fNo/sNo}"
//
//        }



//        setContentView(R.layout.image_vieww)
//
//        val addImg = findViewById<Button>(R.id.btnAddImg)
//        addImg.setOnClickListener {
//            val img = findViewById<ImageView>(R.id.imageViewPhoto)
//            img.setImageResource(R.drawable.princi)
//        }


//        setContentView(R.layout.radio_and_checkbox)
//
//        val Toastt = findViewById<Button>(R.id.btnToastt)
//        Toastt.setOnClickListener {
////            Toast.makeText(this, "The toast!!!!!!!", Toast.LENGTH_LONG ).show()
//
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.clToast))
//                show()
//            }
//        }
//        val order = findViewById<Button>(R.id.btnOrder)
//        order.setOnClickListener {
//
//
//            val checkedPaneerRadioButton = findViewById<RadioGroup>(R.id.rgChoice).checkedRadioButtonId
//            val Choice = findViewById<RadioButton>(checkedPaneerRadioButton)
//            val Cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
//            val Onions = findViewById<CheckBox>(R.id.cbOnions).isChecked
//            val Salad = findViewById<CheckBox>(R.id.cbSalad).isChecked
//
//            val ordered = "You ordered a burger with:\n" +
//                    "${Choice.text}" +
//                    (if(Cheese)"\nCheese" else "") +
//                    (if(Onions)"\nOnions" else "") +
//                    (if(Salad)"\nSalad" else "")
//            findViewById<TextView>(R.id.textViewSummary).text = ordered
//        }



//        setContentView(R.layout.spinner)
//        val spinner: Spinner = findViewById(R.id.spnPlan)
//
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.planets,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            spinner.adapter = adapter
//        }


//        setContentView(R.layout.new_activity)
//        val apply = findViewById<Button>(R.id.btnApply)
//        apply.setOnClickListener {
//        val name = findViewById<EditText>(R.id.etName).text.toString()
//        val age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
//        val country = findViewById<EditText>(R.id.etCountry).text.toString()
//        val person = Person(name, age, country)
//        val intent = Intent(this, SecondActivity::class.java)
//        intent.putExtra("EXTRA_PERSON", person)
////            intent.putExtra("EXTRA_NAME", "$name")
////            intent.putExtra("EXTRA_AGE", "$age")
////            intent.putExtra("EXTRA_COUNTRY", "$country")
//        startActivity(intent)
//        }


//        setContentView(R.layout.permissionss)
//
//        val requestPermissions = findViewById<Button>(R.id.btnPermission)
//        requestPermissions.setOnClickListener {
//            requestPermissions()
//        }
//
//
//    }
//
//
//    private fun hasGrantedBackgroundLocationePermissions() =
//        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
//
////    private fun hasGrantedForeGroundLocationPermissions() =
////        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED
//
//    private fun requestPermissions(){
//        var permissionsToRequest = mutableListOf<String>()
//
//         if(!hasGrantedBackgroundLocationePermissions())
//            permissionsToRequest.add(Manifest.permission.ACCESS_FINE_LOCATION)
////        if(!hasGrantedForeGroundLocationPermissions())
////            permissionsToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
//         if(permissionsToRequest.isNotEmpty()){
//            ActivityCompat.requestPermissions(this, permissionsToRequest.toTypedArray(), 0)
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if(requestCode == 0 && grantResults.isNotEmpty()){
//            for(i in grantResults.indices){
//                if(grantResults[i] == PackageManager.PERMISSION_GRANTED){
//                    Log.d("Permission granted", "$grantResults[i]")
//                }
//            }
//        }
//    }

        setContentView(R.layout.implicit_intent)
        val chooseImage = findViewById<Button>(R.id.btnChooseImage)
        chooseImage.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            val imagee = findViewById<ImageView>(R.id.ivImage)
            imagee.setImageURI(uri)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectOneTheme {
        Greeting("Android")
    }

}