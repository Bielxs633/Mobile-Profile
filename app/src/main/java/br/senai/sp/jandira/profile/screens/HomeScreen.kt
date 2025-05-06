package br.senai.sp.jandira.profile.screens

import android.content.Context
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(360.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.frame),
                    contentDescription = stringResource(R.string.detail),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Arrow",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(R.string.detail),
                            fontSize = 17.sp,
                            color = Color.White,
                        )
                        Box(
                            modifier = Modifier
                                .size(17.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(R.drawable.user),
                            contentDescription = stringResource(R.string.name),
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Text(
                            text = stringResource(R.string.name),
                            fontSize = 25.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                        )
                        Text(
                            text = stringResource(R.string.designer),
                            fontSize = 17.sp,
                            color = Color.LightGray,
                            modifier = Modifier
                                .padding(top = 5.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column(
                            modifier = Modifier
                                .border(
                                    1.dp,
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color.LightGray
                                )
                                .size(80.dp)
                                .padding(top = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Email,
                                contentDescription = "Email",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.email),
                                fontSize = 15.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(
                                    1.dp,
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color.LightGray
                                )
                                .size(80.dp)
                                .padding(top = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Phone,
                                contentDescription = "Cell",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.call),
                                fontSize = 15.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(
                                    1.dp,
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color.LightGray
                                )
                                .size(80.dp)
                                .padding(top = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.whatsapp),
                                contentDescription = "WhatsApp",
                                tint = Color.LightGray,
                                modifier = Modifier.size(24.dp)
                            )
                            Text(
                                text = stringResource(R.string.whats),
                                fontSize = 15.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(
                                    1.dp,
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color.LightGray
                                )
                                .size(80.dp)
                                .padding(top = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Star,
                                contentDescription = "Star",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.favorite),
                                fontSize = 15.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                    }
                }
            }
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color(0xff9489f8))
                        Text(text = stringResource(id = R.string.email), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                        Modifier.padding(start = 5.dp))
                    }
                    Column(modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(top = 10.dp)) {
                        Text(text = stringResource(R.string.oficial), color = Color.Gray, fontSize = 13.sp)
                        Text(text = "gabriel@outlook.com", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        Text(text = stringResource(R.string.personal), color = Color.Gray, fontSize = 13.sp, modifier = Modifier.padding(top = 10.dp))
                        Text(text = "gabriel@gmail.com", fontSize = 15.sp, fontWeight = FontWeight.W400)
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Phone, contentDescription = "Email", tint = Color(0xff9489f8))
                        Text(text = stringResource(id = R.string.phone), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                        Modifier.padding(start = 5.dp))
                    }
                    Column(modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(top = 10.dp)) {
                        Text(text = stringResource(R.string.mobile), color = Color.Gray, fontSize = 13.sp)
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))


                Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()){
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(painter = painterResource(id = R.drawable.whatsapp), contentDescription = "Email", tint = Color(0xff9489f8))
                            Text(text = stringResource(id = R.string.team), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                            Modifier.padding(start = 5.dp))
                        }
                        Column(modifier = Modifier
                            .padding(start = 30.dp)
                            .padding(top = 10.dp)) {
                            Text(text = "Project operation team", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        }
                    }

                    Box(modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(40.dp)
                        .background(color = Color(0xff2f2289))){
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "", tint = Color.White, modifier = Modifier.align(alignment = Alignment.Center))
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))

                Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()){
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Person, contentDescription = "Email", tint = Color(0xff9489f8))
                            Text(text = stringResource(id = R.string.leads), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                            Modifier.padding(start = 5.dp))
                        }
                        Column(modifier = Modifier
                            .padding(start = 30.dp)
                            .padding(top = 10.dp)) {
                            Text(text = "Gabriel", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        }
                    }

                    Box(modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(40.dp)
                        .background(color = Color(0xff2f2289))){
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "", tint = Color.White, modifier = Modifier.align(alignment = Alignment.Center))
                    }
                }

                Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .border(1.dp, shape = RoundedCornerShape(30.dp), color = Color.Gray)
                            .width(200.dp))
                    {

                        Row {
                            Icon(painter = painterResource(R.drawable.user), contentDescription = "", tint = Color(0xff2f2289))
                            Text(text = stringResource(id =R.string.contact), color = Color(0xff2f2289), modifier = Modifier.padding(start = 10.dp), fontSize = 15.sp)
                        }

                    }

                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .border(1.dp, shape = RoundedCornerShape(30.dp), color = Color.Gray)
                            .width(70.dp))
                    {
                        Icon(
                            painter = painterResource(R.drawable.user),
                            contentDescription = "",
                            tint = Color(0xff2f2289)
                        )

                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}