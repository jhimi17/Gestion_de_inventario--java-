unit umain;

interface

uses
  System.SysUtils, System.Types, System.UITypes, System.Classes, System.Variants,
  FMX.Types, FMX.Controls, FMX.Forms, FMX.Graphics, FMX.Dialogs, System.Rtti,
  FMX.Grid.Style, FMX.Memo, FMX.Controls.Presentation, FMX.ScrollBox, FMX.Grid,
  FMX.StdCtrls, FMX.Layouts, FMX.ListBox, FMX.Edit, FMX.Memo.Types;

type
  TForm5 = class(TForm)
    Panel1: TPanel;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Panel2: TPanel;
    Hoja1: TPanel;
    Hoja2: TPanel;
    Hoja3: TPanel;
    Rejilla: TStringGrid;
    mmoLista: TMemo;
    Panel3: TPanel;
    Label1: TLabel;
    Label2: TLabel;
    Edit1: TEdit;
    Edit2: TEdit;
    ListBox1: TListBox;
    Button4: TButton;
    Columnas: TStringColumn;
    StringColumn2: TStringColumn;
    StringColumn3: TStringColumn;
    StringColumn4: TStringColumn;
    StringColumn5: TStringColumn;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form5: TForm5;

implementation

{$R *.fmx}

procedure TForm5.Button1Click(Sender: TObject);
begin
  hoja1.Visible:=true;
  hoja2.Visible:=false;
  hoja3.Visible:=false;
end;

procedure TForm5.Button2Click(Sender: TObject);
begin
  hoja1.Visible:=false;
  hoja2.Visible:=true;
  hoja3.Visible:=false
end;

procedure TForm5.Button3Click(Sender: TObject);
begin
  hoja1.Visible:=false;
  hoja2.Visible:=false;
  hoja3.Visible:=true
end;

procedure TForm5.Button4Click(Sender: TObject);
begin


        Rejilla.Col:=5;
end;

end.
