package com.example.practica1listview.ui.slideshow

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica1listview.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var binding: FragmentSlideshowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSlideshowBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding)
        {
            enviar.setOnClickListener {
                if( validaForm() ){
                    Toast.makeText(context,"Los campos son correctos",Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(context,"Error en la  validacion de los campos",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun validaForm() : Boolean {
        if( validateName() && validateEmail() && validatePass() ) return true
        else return false
    }

    private fun validateName() : Boolean {
        if(binding.name.text.toString() != "" ) return true
        else {
            binding.name.error = "Campo obligatorio"
            binding.name.requestFocus()
            return false
        }
    }

    private fun validatePass(): Boolean {

        val passwordPattern = "^(?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z0-9]{8}$"
        if( binding.password.text.toString().matches(passwordPattern.toRegex())) return true
        else {
            binding.password.error = "La longitud de la cadena es de 8, debe contener numeros y letras"
            binding.password.requestFocus()
            return false
        }

    }

    private fun validateEmail(): Boolean {

        if (Patterns.EMAIL_ADDRESS.matcher(binding.username.text.toString()).matches()) return true
        else {
            binding.username.error = "El formato de email no es correcto"
            binding.username.requestFocus()
            return false
        }
    }


}