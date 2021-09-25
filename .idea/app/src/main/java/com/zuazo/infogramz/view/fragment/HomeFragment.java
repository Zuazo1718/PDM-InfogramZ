package com.zuazo.infogramz.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zuazo.infogramz.R;
import com.zuazo.infogramz.adapter.CardViewAdapter;
import com.zuazo.infogramz.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolBar(getString(R.string.title_home_fragment), false,view);

        // recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layoutmanager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(builImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);


        return view;
    }

    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);


        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagenes
    public ArrayList<Image> builImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://media-cdn.tripadvisor.com/media/photo-s/0e/1b/f4/2a/fuerte-de-samaipata.jpg","Carlos Valdivia","2 dias","1 me gusta"));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2019/07/coroico-parapente.jpeg","Luis Peres","3 dias","5 me gusta"));
        images.add(new Image("https://www.wamanadventures.com/blog/wp-content/uploads/2019/06/La-Laguna-Colorada-Waman-Adventures.jpg","Fernendo Torrico","6 dias","4 me gusta"));
        images.add(new Image("http://assets.cdnelnuevodiario.com/ckeditor/2018/03/25/bolivia-teleferico-de-la-paz.jpg","MAria Flores","5 dias","6 me gusta"));
        images.add(new Image("https://i2.wp.com/andorreandoporelmundo.com/wp-content/uploads/2019/02/IMG_5577.jpg?w=1000&ssl=1","Rolando Morales","3 dias","2 me gusta"));
        images.add(new Image("https://media-cdn.tripadvisor.com/media/photo-s/01/3e/b8/46/puerta-del-sol-tiwanaku.jpg","WWillian Jaimes","4 dias","5 me gusta"));
        images.add(new Image("https://laicismo.org/wp-content/uploads/2017/02/Monumento-Virgen-de-Socavon-en-Oruro-Bolivia.jpg","Roberto Pañagua","2 dias","3 me gusta"));
        images.add(new Image("https://serturista.com/wp-content/uploads/2014/01/Castillo-de-la-Glorieta-2.jpg","Lorena Herrera","2 dias","8 me gusta"));
        images.add(new Image("https://i1.wp.com/elcalderoviajero.com/wp-content/uploads/2018/04/bolivia-cochabamba-incachaca-15.jpg?w=750&ssl=1","Laura Caceres","6 dias","3 me gusta"));
        images.add(new Image("https://www.lostiempos.com/sites/default/files/styles/noticia_detalle/public/media_imagen/2018/1/13/1-_roma_2-_hector_arnez.jpg?itok=UCQEK8Mi","Marcelo Rojas","9 dias","1 me gusta"));

        return images;
    }

}