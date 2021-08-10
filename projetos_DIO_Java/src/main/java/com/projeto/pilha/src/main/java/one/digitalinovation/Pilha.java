package one.digitalinovation;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha(){

        this.refNoEntradaPilha = null;

    }

    public void push(No novoNo){
     No refAuxiliar =refNoEntradaPilha;

     refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpyt()){
            No noPoped =refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }


    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpyt(){
   //     if ( refNoEntradaPilha == null){
  //          return true;
  //      }
   //     return  false;
        return refNoEntradaPilha == null ? true : false;

    }

    @Override
    public String toString() {

        String stringRetorno = "_____________\n";
        stringRetorno += "       pilha\n";
        stringRetorno += "_____________\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar  != null){
                stringRetorno += "[No {dado=" + noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }

        }

        stringRetorno+= "==============";
        return  stringRetorno;
    }

}
