package com.example.questfirebase_083.view.ControlNavigasi



import android.R.attr.type
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.questfirebase_083.view.DetailSiswaScreen
import com.example.questfirebase_083.view.EditSiswaScreen
import com.example.questfirebase_083.view.EntrySiswaScreen
import com.example.questfirebase_083.view.HomeScreen
import com.example.questfirebase_083.view.route.DestinasiDetail
import com.example.questfirebase_083.view.route.DestinasiEdit
import com.example.questfirebase_083.view.route.DestinasiEntry
import com.example.questfirebase_083.view.route.DestinasiHome

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {

        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                navigateToItemUpdate = {
                    navController.navigate("${DestinasiDetail.route}/${it}")
                }
            )
        }

