package me.blog.korn123.easydiary.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import me.blog.korn123.commons.utils.FontUtils
import me.blog.korn123.easydiary.extensions.config


@Composable
fun ScrollableCard(
    textUnit: TextUnit,
    title: String,
    description: String?,
    modifier: Modifier,
    scrollState: ScrollState
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color(LocalContext.current.config.backgroundColor)),
        modifier = (if (LocalContext.current.config.enableCardViewPolicy) modifier.padding(
            3.dp,
            3.dp
        ) else modifier.padding(1.dp, 1.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(15.dp)
                .height(200.dp)
                .verticalScroll(scrollState)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                    fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic,
                    color = Color(LocalContext.current.config.textColor),
                    fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                ),
            )
            description?.let {
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp, 0.dp, 0.dp),
                    text = description,
                    style = TextStyle(
                        fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                        color = Color(LocalContext.current.config.textColor),
                        fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                    ),
                )
            }
        }
    }
}

@Composable
fun CategoryTitleCard(
    textUnit: TextUnit,
    title: String,
) {
    val modifier = Modifier.fillMaxWidth()
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color(LocalContext.current.config.primaryColor)),
        modifier = (if (LocalContext.current.config.enableCardViewPolicy) modifier.padding(
            3.dp,
            3.dp
        ) else modifier.padding(1.dp, 1.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Column(
            modifier = Modifier.padding(15.dp, 5.dp)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                    fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic,
                    color = Color.White,
                    fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                ),
            )
        }
    }
}

@Composable
fun SimpleCard(
    textUnit: TextUnit,
    title: String,
    description: String?,
    modifier: Modifier,
    callback: () -> Unit = {}
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color(LocalContext.current.config.backgroundColor)),
        modifier = (if (LocalContext.current.config.enableCardViewPolicy) modifier.padding(
            3.dp,
            3.dp
        ) else modifier.padding(1.dp, 1.dp)).clickable {
            callback.invoke()
        },
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                    fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic,
                    color = Color(LocalContext.current.config.textColor),
                    fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                ),
            )
            description?.let {
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp, 0.dp, 0.dp),
                    text = description,
                    style = TextStyle(
                        fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                        color = Color(LocalContext.current.config.textColor),
                        fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                    ),
                )
            }
        }
    }
}

@Composable
fun SwitchCard(
    textUnit: TextUnit,
    title: String,
    description: String?,
    modifier: Modifier,
    isOn: Boolean,
    callback: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color(LocalContext.current.config.backgroundColor)),
        modifier = if (LocalContext.current.config.enableCardViewPolicy) modifier.padding(3.dp, 3.dp) else modifier.padding(1.dp, 1.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        onClick = {
            callback.invoke()
        }
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = title,
                    style = TextStyle(
                        fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                        fontWeight = FontWeight.Bold,
                        color = Color(LocalContext.current.config.textColor),
                        fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                    ),
                )
                Switch(
                    modifier = Modifier.absolutePadding(left = 5.dp),
                    checked = isOn,
                    onCheckedChange = {
                        callback.invoke()
                    },
                    thumbContent = if (isOn) {
                        {
                            Icon(
                                imageVector = Icons.Filled.Check,
                                contentDescription = null,
                                modifier = Modifier.size(SwitchDefaults.IconSize),
                            )
                        }
                    } else {
                        null
                    }
                )
            }
            description?.let {
                Row(
                ) {
                    Text(
                        text = description,
                        style = TextStyle(
                            fontFamily = if (LocalInspectionMode.current) null else FontUtils.getComposeFontFamily(LocalContext.current),
                            color = Color(LocalContext.current.config.textColor),
                            fontSize = TextUnit(textUnit.value, TextUnitType.Sp),
                        ),
                    )
                }
            }
        }
    }
}