public class BasicActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button buttonMenu;
    List<ListaExerciciosBasic> listaExercicios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getSupportActionBar().setTitle( "Basic exercises" );
        buttonMenu = findViewById( R.id.buttonVoltarMenu );
        getSupportActionBar().setHomeButtonEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setElevation( 2 );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getSupportActionBar().setBackgroundDrawable( getDrawable( R.color.colorPrimaryDark ) );
        }
        setContentView( R.layout.activity_basic );
        recyclerView = findViewById( R.id.recyclerBasic );

        LinearLayoutManager layoutManager = new LinearLayoutManager( getApplicationContext() );
        layoutManager.setOrientation( LinearLayout.HORIZONTAL );
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );
        AdapterExerciciosBasic adapterExerciciosBasic = new AdapterExerciciosBasic( listaExercicios );
        recyclerView.setAdapter( adapterExerciciosBasic );
        this.criarExercicios();

    }

    public void criarExercicios() {
        ListaExerciciosBasic listaExerciciosBasic = new ListaExerciciosBasic(
                "1) Choose the alternative with the correct demonstrative pronoun:\n\nWhat are _____ objects over there?\n", "That", "This", "These", "Those");
        this.listaExercicios.add( listaExerciciosBasic );

        listaExerciciosBasic = new ListaExerciciosBasic( "2) Choose the alternative with the best option:\n\na. What is _____ across the street?\n" +
                "b. Is _____ your jacket in your hands?\n" +
                "c. Who are _____ guys with you?\n", "That / That / Those", "That / This / These", "That / This / Those", "This / This / These");
        this.listaExercicios.add( listaExerciciosBasic );
   }

    public void voltarMenuExercicios(View view){
        startActivity( new Intent( getApplicationContext(), ExerciciosActivity.class ) );
    }
}
