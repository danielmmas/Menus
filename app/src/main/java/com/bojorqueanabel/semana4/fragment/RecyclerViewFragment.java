package com.bojorqueanabel.semana4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

;
import com.bojorqueanabel.semana4.pogo.Mascota;
import com.bojorqueanabel.semana4.adapter.MascotaAdaptador;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {

    ArrayList <Mascota> mascotas;
    public RecyclerView rvMascotas;
    /*
       public RecyclerViewFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RecyclerViewFragment newInstance(String param1, String param2) {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recicler_view, container, false);

        rvMascotas = ( RecyclerView) v.findViewById(R.id.rvMascotasFragment);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        rvMascotas.setLayoutManager(linearLayoutManager);
        inicializarListaContactos();
        inicializarAdaptador();
        return v;
    }
    public void inicializarAdaptador (){
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas,getActivity());
        rvMascotas.setAdapter(mascotaAdaptador);
    }


    public void inicializarListaContactos () {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro1, "Cangrejo", "0"));
        mascotas.add(new Mascota(R.drawable.perro2, "Delfin", "0"));
        mascotas.add(new Mascota(R.drawable.perro3, "Pulpo", "0"));
        mascotas.add(new Mascota(R.drawable.perro4, "Estrella", "0"));
        mascotas.add(new Mascota(R.drawable.perro5, "Calamar", "0"));
    }


}