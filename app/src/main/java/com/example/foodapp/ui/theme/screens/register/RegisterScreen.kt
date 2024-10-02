package com.example.foodapp.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.foodapp.R
import com.example.foodapp.navigation.ROUTE_LOGIN
import com.example.foodapp.viewmodel.AuthViewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController){
    var firstname  by remember{ mutableStateOf(TextFieldValue("")) }
    var lastname  by remember{ mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var age by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember{ mutableStateOf(TextFieldValue("")) }
    var confirmpassword by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current
//    Column (verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Black))
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.background), // Replace with your image resource
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop // This makes sure the image fills the screen
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White.copy(alpha = 0.7f)) // Optional white overlay with transparency
        )
        {
            Text(
                text = "Register",
                color = Color.Black,
                fontSize = 40.sp,
                fontFamily = FontFamily.SansSerif,
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = firstname,
                onValueChange = { firstname = it },
                label = {
                    Text(
                        text = "First Name",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                },

                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedTextColor = Color.Black
                )

            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = lastname,
                onValueChange = { lastname = it },
                label = {
                    Text(
                        text = "Last Name",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                },

                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedTextColor = Color.Black
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(
                        text = "Email",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                },

                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedTextColor = Color.Black
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = {
                    Text(
                        text = "Create Password",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                },

                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedTextColor = Color.Black
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = confirmpassword,
                onValueChange = { confirmpassword = it },
                label = {
                    Text(
                        text = "Confirm password",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                },

                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedTextColor = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = {
                    val myregister= AuthViewModel(navController,context)
                    myregister.signup(email.text.trim(),password.text.trim(),confirmpassword.text.trim())
                    navController.navigate(ROUTE_LOGIN)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "REGISTER",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 25.sp
                )
            }


        }
    }
}

@Preview
@Composable
private fun Myregisterscreen() {
    RegisterScreen(rememberNavController())

}