package com.example.luissancar.recyclerviewkotlin2

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_datos.view.*


class DatosAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Obtiene el número de datos
    override fun getItemCount(): Int {
        return items.size
    }

    //infla el layout activity_datos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_datos, parent, false))



    }




    // carga datos del ArrayList aL TEXTVIEW view


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvDatos?.text = items.get(position)



    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Mantiene el TextView
    val tvDatos = view.textViewDatos



}