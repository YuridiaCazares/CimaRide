package com.example.cimaride


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cimaride.databinding.ActivityMainBinding
import com.example.cimaride.databinding.ActivitySecondBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bindingOne: ActivityMainBinding
    private  lateinit var bindingSecundario: ActivitySecondBinding

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate ( savedInstanceState: Bundle? ) {
        super.onCreate ( savedInstanceState )
        bindingOne = ActivityMainBinding.inflate ( layoutInflater )
        setContentView ( bindingOne.root )
        this.bottomNavigationView = findViewById(R.id.bottomNavigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){


                R.id.nav_historial ->{
                    replaceFragment(HistorialFragment())
                    true
                }
                R.id.nav_viajes ->{
                    replaceFragment(RutasFragment())
                    true
                }
                R.id.nav_perfil->{
                    replaceFragment(PerfilFragment())
                    true
                }

                R.id.nav_menu->{
                    replaceFragment(MenuFragment())
                    true
                }
                else -> false
            }
        }



    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.containerView, fragment).commit()
    }
}


/*
        CambiarSegundoLayout()


    //función para que el boton inicio de sesión cambie al segundo layout
    private fun CambiarSegundoLayout() {
        bindingOne.BotonIniciarSesion.setOnClickListener {
            setContentView ( bindingSecundario.root )


        }
    }

    //función para validar que los campos contengan texto
    private fun validarCampos(): Boolean {
        val name = binding.recibenombre.text.toString()
        val username = binding.recibeusuario.text.toString()
        val age = binding.recibefechanacimiento.text.toString()
        val email = binding.recibecorreo.text.toString()
        val password = binding.recibecontrasenia.text.toString()

        return !name.isNullOrEmpty() &&
                !username.isNullOrEmpty() &&
                !age.isNullOrEmpty() &&
                !email.isNullOrEmpty() &&
                !password.isNullOrEmpty()
    }
*/