package com.example.mylogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){

   Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Image(painter = painterResource(id = R.drawable.images), contentDescription ="login image", modifier = Modifier.size(200.dp))

      Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
      
      Spacer(modifier = Modifier.height(16.dp))
      
      Text(text = "Login to your account")

      OutlinedTextField(value = "", onValueChange ={}, label = { Text(text = "Email address")} )

      Spacer(modifier = Modifier.height(16.dp))

      OutlinedTextField(value = "", onValueChange ={}, label = { Text(text = "Password")} )

      Spacer(modifier = Modifier.height(16.dp))
      
      Button(onClick = { }) {
         Text(text = "Login")
         
      }
      
      Spacer(modifier = Modifier.height(32.dp))

      TextButton(onClick = { }) {
         Text(text = "Forgot Password?")

      }
   }

}