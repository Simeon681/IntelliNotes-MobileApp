package com.example.intellinotes.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.intellinotes.R
import com.example.intellinotes.components.DividerText
import com.example.intellinotes.components.EmailTextField
import com.example.intellinotes.components.HeadingText
import com.example.intellinotes.components.NormalButton
import com.example.intellinotes.components.NormalClickableText
import com.example.intellinotes.components.PasswordTextField

@Composable
fun LoginScreen(
    email: String,
    onEmailChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit,
    onButtonClick: () -> Unit,
    onTextClick: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 28.dp, end = 28.dp),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            HeadingText(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.padding(20.dp))

            EmailTextField(
                value = email,
                labelValue = stringResource(id = R.string.email),
                onChange = onEmailChange,
                painterResource = Icons.Default.Email
            )

            Spacer(modifier = Modifier.padding(10.dp))

            PasswordTextField(
                value = password,
                labelValue = stringResource(id = R.string.password),
                onChange = onPasswordChange,
                painterResource = Icons.Default.Lock
            )

            Spacer(modifier = Modifier.padding(10.dp))

            NormalButton(
                value = stringResource(id = R.string.login),
                onClick = onButtonClick
            )

            DividerText(value = stringResource(id = R.string.or))

            NormalClickableText(
                initialText = "Don't have an account yet?",
                mainText = stringResource(id = R.string.register),
                onTextSelected = onTextClick
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        email = "",
        onEmailChange = {},
        password = "",
        onPasswordChange = {},
        onButtonClick = {},
        onTextClick = {}
    )
}

