# Comandos equivalentes entre DOS/CMD do Windows e o Linux



_Esta seção contém os comandos equivalentes entre estes dois sistemas e a avaliação entre ambos. Grande parte dos comandos podem ser usados da mesma forma que no DOS, mas os comandos Linux possuem avanços para utilização neste ambiente multiusuário/multitarefa._

**O objetivo desta seção é permitir as pessoas com experiência em DOS fazer rapidamente no GNU/Linux as tarefas que fazem no DOS. A primeira coluna tem o nome do comando no DOS, a segunda o comando que possui a mesma função no GNU/Linux e na terceira coluna as diferenças.**

  DOS       Linux                        Diferenças
--------  ------------ --------------------------------------------------
cls       clear        Sem diferenças.
dir       ls -la       A listagem no Linux possui mais campos (as 
                       permissões de acesso) e o total de espaço ocupado 
                       no diretório e livre no disco deve ser visto 
                       separadamente usando o comando du e df.
                       Permite também listar o conteúdo de diversos 
                       diretórios com um só comando (ls /bin /sbin /...).
dir/s     ls -lR       Sem diferenças.
dir/od    ls -tr       Sem diferenças.
cd        cd           Poucas diferenças. cd sem parâmetros retorna ao 
                       diretório de usuário e também permite o uso 
                       de "cd -" para retornar ao diretório anteriormente 
                       acessado.
del       rm           Poucas diferenças. O rm do Linux permite 
                       especificar diversos arquivos que serão apagados 
                       (rm arquivo1 arquivo2 arquivo3). Para ser mostrados 
                       os arquivos apagados, deve-se especificar o 
                       parâmetro "-v" ao comando, e "-i" para pedir 
                       a confirmação ao apagar arquivos. 
md        mkdir        Uma só diferença: No Linux permite que vários 
                       diretórios sejam criados de uma só vez 
                       (mkdir /tmp/a /tmp/b...). 
copy      cp           Poucas diferenças. Para ser mostrados os arquivos 
                       enquanto estão sendo copiados, deve-se usar a 
                       opção "-v", e para que ele pergunte se deseja 
                       substituir um arquivo já existente, deve-se usar 
                       a opção "-i".
echo      echo         Sem diferenças.
path      path         No Linux deve ser usado ":" para separar os 
                       diretórios e usar o comando 
                       "export PATH=caminho1:/caminho2:/caminho3:"
                       para definir a variável de ambiente PATH.
                       O path atual pode ser visualizado através 
                       do comando "echo $PATH".
ren       mv           Poucas diferenças. No Linux não é possível 
                       renomear vários arquivos de uma só vez 
                       (como "ren *.txt *.bak"). É necessário usar 
                       um shell script para fazer isto. 
type      cat          Sem diferenças. 
ver       uname -a     Poucas diferenças (o uname tem algumas opções 
                       a mais).
date      date         No Linux mostra/modifica a Data e Hora do sistema.
time      date         No Linux mostra/modifica a Data e Hora do sistema.
attrib    chmod        O chmod possui mais opções por tratar as permissões 
                       de acesso de leitura, gravação e execução para 
                       donos, grupos e outros usuários. 
chkdsk    fsck         O fack é mais rápido e a checagem mais abrangente.
scandisk  fsck         O fsck é mais rápido e a checagem mais abrangente.
doskey    -----        A memorização de comandos é feita automaticamente pelo 
                       bash.
edit      vi, ae,      O edit é mais fácil de usar, mas usuário
        emacs, mcedit experientes apreciarão os recursos do vi ou 
                       o emacs (programado em lisp).
fdisk    fdisk, cfdisk Os particionadores do Linux trabalham com 
                       praticamente todos os tipos de partições de 
                       diversos sistemas de arquivos diferentes.
format    mkfs.ext3    Poucas diferenças, precisa apenas que seja 
                       especificado o dispositivo a ser formatado 
                       como "/dev/fd0" ou "/dev/hda10" (o 
                       tipo de identificação usada no Linux), ao 
                       invés de "A:" ou "C:". 
help      man, info    Sem diferenças.
interlnk  plip         O plip do Linux permite que sejam montadas 
                       redes reais a partir de uma conexão via Cabo 
                       Paralelo ou Serial. A máquina pode fazer tudo 
                       o que poderia fazer conectada em uma rede 
                       (na realidade é uma rede e usa o TCP/IP como 
                       protocolo) inclusive navegar na Internet, enviar 
                       e-mails, irc, etc. 
intersvr  plip         Mesmo que o acima.
keyb      loadkeys     Sem diferenças (somente que a posição das 
                       teclas do teclado pode ser editada. 
                       Desnecessário para a maioria dos usuários).
label     e2label      É necessário especificar a partição que terá 
                       o nome modificado.
mem       cat /proc/meminfo Mostra detalhes sobre a quantidade de dados 
          top          em buffers, cache e memória virtual (disco). 
more      more, less   O more é equivalente a ambos os sistemas, mas 
                       o less permite que sejam usadas as setas para 
                       cima e para baixo, o que torna a leitura do 
                       texto muito mais agradável. 
move      mv           Poucas diferenças. Para ser mostrados os arquivos 
                       enquanto estão sendo movidos, deve-se usar a 
                       opção "-v", e para que ele pergunte se deseja 
                       substituir um arquivo já existente deve-se usar 
                       a opção "-i". 
scan      clamav       Os principais fabricantes disponibilizam anti-virus
                       para Linux, na maioria das vezes para integrar a 
                       servidores de arquivos, e-mails, protegendo estações
                       Windows. Infecções por vírus são raras no Linux devido 
                       as restrições do usuário durante execução de 
                       programas (quando corretamente utilizadas). 
backup    tar          O tar permite o uso de compactação (através do 
                       parâmetro -z) e tem um melhor esquema de 
                       recuperação de arquivos corrompidos que já 
                       segue evoluindo há 30 anos em sistemas UNIX. 
print     lpr          O lpr é mais rápido e permite até mesmo 
                       impressões de gráficos ou arquivos compactados 
                       diretamente caso seja usado o programa 
                       magicfilter. É o programa de Spool de 
                       impressoras usados no sistema Linux/Unix. 
vol       e2label      Sem diferenças.
xcopy     cp -R        Pouca diferença, requer que seja usado a 
                       opção "-v" para mostrar os arquivos que 
                       estão sendo copiados e "-i" para pedir 
                       confirmação de substituição de arquivos.
Arquivos de configuração
Os arquivos config.sys e autoexec.bat são equivalentes aos arquivos do diretório /etc especialmente o /etc/inittab e arquivos dentro do diretório /etc/init.d .