

# This file was automatically generated by tmake at 17:30, 2001/04/28
# DO NOT CHANGE THIS FILE, YOUR CHANGES WILL BE LOST! CHANGE SC.T!

# Symantec C++ makefile for the msw objects
# called from src\makefile.sc

# configuration section (see src\makefile.sc) ###########################

WXDIR = $(WXWIN)

include ..\makesc.env

DEBUG=0

LIBTARGET = $(LIBDIR)\wx.lib

OPTIONS=

# end of configuration section ##########################################

GENDIR=$(WXDIR)\src\generic
COMMDIR=$(WXDIR)\src\common
XPMDIR=$(WXDIR)\src\xpm
OLEDIR=ole
MSWDIR=$(WXDIR)\src\msw

GENERICOBJS= $(GENDIR)\busyinfo.obj \
		$(GENDIR)\calctrl.obj \
		$(GENDIR)\choicdgg.obj \
		$(GENDIR)\dirctrlg.obj \
		$(GENDIR)\dragimgg.obj \
		$(GENDIR)\grid.obj \
		$(GENDIR)\gridsel.obj \
		$(GENDIR)\laywin.obj \
		$(GENDIR)\logg.obj \
		$(GENDIR)\numdlgg.obj \
		$(GENDIR)\panelg.obj \
		$(GENDIR)\plot.obj \
		$(GENDIR)\progdlgg.obj \
		$(GENDIR)\prop.obj \
		$(GENDIR)\propform.obj \
		$(GENDIR)\proplist.obj \
		$(GENDIR)\sashwin.obj \
		$(GENDIR)\scrolwin.obj \
		$(GENDIR)\splash.obj \
		$(GENDIR)\splitter.obj \
		$(GENDIR)\statusbr.obj \
		$(GENDIR)\tbarsmpl.obj \
		$(GENDIR)\textdlgg.obj \
		$(GENDIR)\tipdlg.obj \
		$(GENDIR)\treectlg.obj \
		$(GENDIR)\treelay.obj \
		$(GENDIR)\wizard.obj

COMMONOBJS = \
		$(COMMDIR)\y_tab.obj \
		$(COMMDIR)\appcmn.obj \
		$(COMMDIR)\choiccmn.obj \
		$(COMMDIR)\clipcmn.obj \
		$(COMMDIR)\cmdline.obj \
		$(COMMDIR)\cmndata.obj \
		$(COMMDIR)\config.obj \
		$(COMMDIR)\ctrlcmn.obj \
		$(COMMDIR)\ctrlsub.obj \
		$(COMMDIR)\datetime.obj \
		$(COMMDIR)\datstrm.obj \
		$(COMMDIR)\db.obj \
		$(COMMDIR)\dbtable.obj \
		$(COMMDIR)\dcbase.obj \
		$(COMMDIR)\dlgcmn.obj \
		$(COMMDIR)\dndcmn.obj \
		$(COMMDIR)\dobjcmn.obj \
		$(COMMDIR)\docmdi.obj \
		$(COMMDIR)\docview.obj \
		$(COMMDIR)\dynarray.obj \
		$(COMMDIR)\dynlib.obj \
		$(COMMDIR)\effects.obj \
		$(COMMDIR)\encconv.obj \
		$(COMMDIR)\event.obj \
		$(COMMDIR)\extended.obj \
		$(COMMDIR)\ffile.obj \
		$(COMMDIR)\file.obj \
		$(COMMDIR)\fileconf.obj \
		$(COMMDIR)\filefn.obj \
		$(COMMDIR)\filesys.obj \
		$(COMMDIR)\fontcmn.obj \
		$(COMMDIR)\fontmap.obj \
		$(COMMDIR)\framecmn.obj \
		$(COMMDIR)\fs_inet.obj \
		$(COMMDIR)\fs_mem.obj \
		$(COMMDIR)\fs_zip.obj \
		$(COMMDIR)\ftp.obj \
		$(COMMDIR)\gdicmn.obj \
		$(COMMDIR)\geometry.obj \
		$(COMMDIR)\gifdecod.obj \
		$(COMMDIR)\hash.obj \
		$(COMMDIR)\helpbase.obj \
		$(COMMDIR)\http.obj \
		$(COMMDIR)\imagall.obj \
		$(COMMDIR)\imagbmp.obj \
		$(COMMDIR)\image.obj \
		$(COMMDIR)\imaggif.obj \
		$(COMMDIR)\imagjpeg.obj \
		$(COMMDIR)\imagpcx.obj \
		$(COMMDIR)\imagpng.obj \
		$(COMMDIR)\imagpnm.obj \
		$(COMMDIR)\imagtiff.obj \
		$(COMMDIR)\imagxpm.obj \
		$(COMMDIR)\intl.obj \
		$(COMMDIR)\ipcbase.obj \
		$(COMMDIR)\layout.obj \
		$(COMMDIR)\lboxcmn.obj \
		$(COMMDIR)\list.obj \
		$(COMMDIR)\log.obj \
		$(COMMDIR)\longlong.obj \
		$(COMMDIR)\memory.obj \
		$(COMMDIR)\menucmn.obj \
		$(COMMDIR)\mimecmn.obj \
		$(COMMDIR)\module.obj \
		$(COMMDIR)\mstream.obj \
		$(COMMDIR)\object.obj \
		$(COMMDIR)\objstrm.obj \
		$(COMMDIR)\odbc.obj \
		$(COMMDIR)\paper.obj \
		$(COMMDIR)\prntbase.obj \
		$(COMMDIR)\process.obj \
		$(COMMDIR)\protocol.obj \
		$(COMMDIR)\quantize.obj \
		$(COMMDIR)\resource.obj \
		$(COMMDIR)\sckaddr.obj \
		$(COMMDIR)\sckfile.obj \
		$(COMMDIR)\sckipc.obj \
		$(COMMDIR)\sckstrm.obj \
		$(COMMDIR)\serbase.obj \
		$(COMMDIR)\sizer.obj \
		$(COMMDIR)\socket.obj \
		$(COMMDIR)\strconv.obj \
		$(COMMDIR)\stream.obj \
		$(COMMDIR)\string.obj \
		$(COMMDIR)\tbarbase.obj \
		$(COMMDIR)\textcmn.obj \
		$(COMMDIR)\textfile.obj \
		$(COMMDIR)\timercmn.obj \
		$(COMMDIR)\tokenzr.obj \
		$(COMMDIR)\treebase.obj \
		$(COMMDIR)\txtstrm.obj \
		$(COMMDIR)\unzip.obj \
		$(COMMDIR)\url.obj \
		$(COMMDIR)\utilscmn.obj \
		$(COMMDIR)\valgen.obj \
		$(COMMDIR)\validate.obj \
		$(COMMDIR)\valtext.obj \
		$(COMMDIR)\variant.obj \
		$(COMMDIR)\wfstream.obj \
		$(COMMDIR)\wincmn.obj \
		$(COMMDIR)\wxchar.obj \
		$(COMMDIR)\wxexpr.obj \
		$(COMMDIR)\xpmdecod.obj \
		$(COMMDIR)\zipstrm.obj \
		$(COMMDIR)\zstream.obj

MSWOBJS = $(MSWDIR)\accel.obj \
		$(MSWDIR)\app.obj \
		$(MSWDIR)\ole\automtn.obj \
		$(MSWDIR)\bitmap.obj \
		$(MSWDIR)\bmpbuttn.obj \
		$(MSWDIR)\brush.obj \
		$(MSWDIR)\button.obj \
		$(MSWDIR)\caret.obj \
		$(MSWDIR)\checkbox.obj \
		$(MSWDIR)\checklst.obj \
		$(MSWDIR)\choice.obj \
		$(MSWDIR)\clipbrd.obj \
		$(MSWDIR)\colordlg.obj \
		$(MSWDIR)\colour.obj \
		$(MSWDIR)\combobox.obj \
		$(MSWDIR)\control.obj \
		$(MSWDIR)\curico.obj \
		$(MSWDIR)\cursor.obj \
		$(MSWDIR)\data.obj \
		$(MSWDIR)\ole\dataobj.obj \
		$(MSWDIR)\dc.obj \
		$(MSWDIR)\dcclient.obj \
		$(MSWDIR)\dcmemory.obj \
		$(MSWDIR)\dcprint.obj \
		$(MSWDIR)\dcscreen.obj \
		$(MSWDIR)\dde.obj \
		$(MSWDIR)\dialog.obj \
		$(MSWDIR)\dialup.obj \
		$(MSWDIR)\dib.obj \
		$(MSWDIR)\dibutils.obj \
		$(MSWDIR)\dir.obj \
		$(MSWDIR)\dirdlg.obj \
		$(MSWDIR)\dragimag.obj \
		$(MSWDIR)\ole\dropsrc.obj \
		$(MSWDIR)\ole\droptgt.obj \
		$(MSWDIR)\enhmeta.obj \
		$(MSWDIR)\filedlg.obj \
		$(MSWDIR)\font.obj \
		$(MSWDIR)\fontdlg.obj \
		$(MSWDIR)\fontenum.obj \
		$(MSWDIR)\fontutil.obj \
		$(MSWDIR)\frame.obj \
		$(MSWDIR)\gauge95.obj \
		$(MSWDIR)\gaugemsw.obj \
		$(MSWDIR)\gdiimage.obj \
		$(MSWDIR)\gdiobj.obj \
		$(MSWDIR)\glcanvas.obj \
		$(MSWDIR)\gsocket.obj \
		$(MSWDIR)\gsockmsw.obj \
		$(MSWDIR)\helpchm.obj \
		$(MSWDIR)\helpwin.obj \
		$(MSWDIR)\icon.obj \
		$(MSWDIR)\iniconf.obj \
		$(MSWDIR)\listbox.obj \
		$(MSWDIR)\main.obj \
		$(MSWDIR)\mdi.obj \
		$(MSWDIR)\menu.obj \
		$(MSWDIR)\menuitem.obj \
		$(MSWDIR)\metafile.obj \
		$(MSWDIR)\mimetype.obj \
		$(MSWDIR)\minifram.obj \
		$(MSWDIR)\msgdlg.obj \
		$(MSWDIR)\nativdlg.obj \
		$(MSWDIR)\ole\oleutils.obj \
		$(MSWDIR)\ownerdrw.obj \
		$(MSWDIR)\palette.obj \
		$(MSWDIR)\pen.obj \
		$(MSWDIR)\penwin.obj \
		$(MSWDIR)\printdlg.obj \
		$(MSWDIR)\printwin.obj \
		$(MSWDIR)\radiobox.obj \
		$(MSWDIR)\radiobut.obj \
		$(MSWDIR)\regconf.obj \
		$(MSWDIR)\region.obj \
		$(MSWDIR)\registry.obj \
		$(MSWDIR)\scrolbar.obj \
		$(MSWDIR)\settings.obj \
		$(MSWDIR)\slider95.obj \
		$(MSWDIR)\slidrmsw.obj \
		$(MSWDIR)\spinbutt.obj \
		$(MSWDIR)\spinctrl.obj \
		$(MSWDIR)\statbmp.obj \
		$(MSWDIR)\statbox.obj \
		$(MSWDIR)\statbr95.obj \
		$(MSWDIR)\statline.obj \
		$(MSWDIR)\stattext.obj \
		$(MSWDIR)\tabctrl.obj \
		$(MSWDIR)\taskbar.obj \
		$(MSWDIR)\tbar95.obj \
		$(MSWDIR)\tbarmsw.obj \
		$(MSWDIR)\textctrl.obj \
		$(MSWDIR)\thread.obj \
		$(MSWDIR)\timer.obj \
		$(MSWDIR)\tooltip.obj \
		$(MSWDIR)\treectrl.obj \
		$(MSWDIR)\utils.obj \
		$(MSWDIR)\utilsexc.obj \
		$(MSWDIR)\ole\uuid.obj \
		$(MSWDIR)\wave.obj \
		$(MSWDIR)\window.obj \
		$(MSWDIR)\xpmhand.obj

XPMOBJECTS = 	$(XPMDIR)\crbuffri.obj\
		$(XPMDIR)\crdatfri.obj\
		$(XPMDIR)\create.obj $(XPMDIR)\crifrbuf.obj\
		$(XPMDIR)\crifrdat.obj\
		$(XPMDIR)\data.obj\
		$(XPMDIR)\hashtab.obj $(XPMDIR)\misc.obj\
		$(XPMDIR)\parse.obj $(XPMDIR)\rdftodat.obj\
		$(XPMDIR)\rdftoi.obj\
		$(XPMDIR)\rgb.obj $(XPMDIR)\scan.obj\
		$(XPMDIR)\simx.obj $(XPMDIR)\wrffrdat.obj\
		$(XPMDIR)\wrffrp.obj $(XPMDIR)\wrffri.obj

# Add $(NONESSENTIALOBJS) if wanting generic dialogs, PostScript etc.
OBJECTS = $(COMMONOBJS) $(GENERICOBJS) $(MSWOBJS) # $(XPMOBJECTS)

all: $(LIBTARGET)

$(LIBTARGET): $(OBJECTS)
	-del $(LIBTARGET)
	*lib /PAGESIZE:512 $(LIBTARGET) y $(OBJECTS), nul;

clean:
	-del *.obj
    -del $(LIBTARGET)

$(COMMDIR)\y_tab.obj:     $(COMMDIR)\y_tab.c $(COMMDIR)\lex_yy.c

$(COMMDIR)\y_tab.c:     $(COMMDIR)\dosyacc.c
        copy $(COMMDIR)\dosyacc.c $(COMMDIR)\y_tab.c

$(COMMDIR)\lex_yy.c:    $(COMMDIR)\doslex.c
    copy $(COMMDIR)\doslex.c $(COMMDIR)\lex_yy.c

# $(COMMDIR)\cmndata.obj:     $(COMMDIR)\cmndata.cpp
#	*$(CC) -c $(CFLAGS) -I$(INCLUDE) $(OPTIONS) $(COMMDIR)\cmndata.cpp -o$(COMMDIR)\cmndata.obj

MFTYPE=sc
makefile.$(MFTYPE) : $(WXWIN)\distrib\msw\tmake\filelist.txt $(WXWIN)\distrib\msw\tmake\$(MFTYPE).t
	cd $(WXWIN)\distrib\msw\tmake
	tmake -t $(MFTYPE) wxwin.pro -o makefile.$(MFTYPE)
	copy makefile.$(MFTYPE) $(WXWIN)\src\msw
