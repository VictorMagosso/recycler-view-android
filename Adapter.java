public class AdapterExerciciosBasic extends RecyclerView.Adapter<AdapterExerciciosBasic.MyViewHolder> {
    private List<ListaExerciciosBasic> listaExercicio;

    public AdapterExerciciosBasic(List<ListaExerciciosBasic> lista){
        this.listaExercicio = lista;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.adapter,parent, false);


        Snackbar.make( parent, "Swipe left or right to navigate into the exercises",
                Snackbar.LENGTH_INDEFINITE).setAction( "Ok!", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } ).setBackgroundTint( R.color.colorSecondary )
                .show();

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ListaExerciciosBasic listaExerciciosBasic = listaExercicio.get(position);


        holder.titulo.setText( listaExerciciosBasic.getTituloExercicio() );
        holder.alternativaUm.setText( listaExerciciosBasic.getAlternativaUm() );
        holder.alternativaDois.setText(listaExerciciosBasic.getAlternativaDois());
        holder.alternativaTres.setText(listaExerciciosBasic.getAlternativeTres());
        holder.alternativaQuatro.setText(listaExerciciosBasic.getAlternativaQuatro());
        holder.textAnswer.setText( listaExerciciosBasic.getTextAnswer() );


    }

    @Override
    public int getItemCount() {
        return listaExercicio.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, textAnswer;
        private Button buttonAnswer;
        private RadioButton alternativaUm, alternativaDois, alternativaTres, alternativaQuatro;


        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            titulo = itemView.findViewById( R.id.textTitulo );
            alternativaUm     = itemView.findViewById( R.id.radioAltUm );
            alternativaDois   = itemView.findViewById( R.id.radioAltDois );
            alternativaTres   = itemView.findViewById( R.id.radioAltTres );
            alternativaQuatro = itemView.findViewById( R.id.radioAltQuatro );
            buttonAnswer      = itemView.findViewById( R.id.buttonAnswer );
            textAnswer        = itemView.findViewById( R.id.textAnswer );


            buttonAnswer.setOnClickListener( new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                //dupla checagem para validação segura
                    if (alternativaQuatro.isChecked() && alternativaQuatro.getText().equals( "Those" )) {
                        textAnswer.setVisibility( View.VISIBLE );
                        textAnswer.setText( "Correct!!! In this sentence, the objects are far from the person. So, distant and more than one: Demonstrative pronoun THOSE" );
                        textAnswer.setTextSize( 20 );

                    }else if (alternativaDois.isChecked() && alternativaDois.getText().equals( "That / This / These" )) {
                        textAnswer.setVisibility( View.VISIBLE );
                        textAnswer.setText( "Correct!!! 1) Distant and singular: THAT 2) We understand that is near and is singular: THIS 3) We understand that there are more than one person near: THESE" );
                        textAnswer.setTextSize( 20 );
                    {...}

                    }else{textAnswer.setVisibility( View.VISIBLE );
                        textAnswer.setText( "Wrong answer! Try again...");
                        textAnswer.setTextSize( 30 );
                   }
                }
            } );

        }

    }
}
