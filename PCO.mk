##
## Auto Generated makefile by CodeLite IDE
## any manual changes will be erased      
##
## Debug
ProjectName            :=PCO
ConfigurationName      :=Debug
WorkspacePath          :=C:/Users/Ricardo/IST/PCO
ProjectPath            :=C:/Users/Ricardo/IST/PCO
IntermediateDirectory  :=./Debug
OutDir                 := $(IntermediateDirectory)
CurrentFileName        :=
CurrentFilePath        :=
CurrentFileFullPath    :=
User                   :=Ricardo
Date                   :=16/09/2018
CodeLitePath           :="C:/Program Files/CodeLite"
LinkerName             :=C:/TDM-GCC-64/bin/g++.exe
SharedObjectLinkerName :=C:/TDM-GCC-64/bin/g++.exe -shared -fPIC
ObjectSuffix           :=.o
DependSuffix           :=.o.d
PreprocessSuffix       :=.i
DebugSwitch            :=-g 
IncludeSwitch          :=-I
LibrarySwitch          :=-l
OutputSwitch           :=-o 
LibraryPathSwitch      :=-L
PreprocessorSwitch     :=-D
SourceSwitch           :=-c 
OutputFile             :=$(IntermediateDirectory)/$(ProjectName)
Preprocessors          :=
ObjectSwitch           :=-o 
ArchiveOutputSwitch    := 
PreprocessOnlySwitch   :=-E
ObjectsFileList        :="PCO.txt"
PCHCompileFlags        :=
MakeDirCommand         :=makedir
RcCmpOptions           := 
RcCompilerName         :=C:/TDM-GCC-64/bin/windres.exe
LinkOptions            :=  -O0
IncludePath            :=  $(IncludeSwitch). $(IncludeSwitch). 
IncludePCH             := 
RcIncludePath          := 
Libs                   := 
ArLibs                 :=  
LibPath                := $(LibraryPathSwitch). $(LibraryPathSwitch). $(LibraryPathSwitch)Debug 

##
## Common variables
## AR, CXX, CC, AS, CXXFLAGS and CFLAGS can be overriden using an environment variables
##
AR       := C:/TDM-GCC-64/bin/ar.exe rcu
CXX      := C:/TDM-GCC-64/bin/g++.exe
CC       := C:/TDM-GCC-64/bin/gcc.exe
CXXFLAGS :=  -g -Wall $(Preprocessors)
CFLAGS   :=   $(Preprocessors)
ASFLAGS  := 
AS       := C:/TDM-GCC-64/bin/as.exe


##
## User defined environment variables
##
CodeLiteDir:=C:\Program Files\CodeLite
Objects0=$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_test.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(ObjectSuffix) \
	$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(ObjectSuffix) $(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(ObjectSuffix) 



Objects=$(Objects0) 

##
## Main Build Targets 
##
.PHONY: all clean PreBuild PrePreBuild PostBuild MakeIntermediateDirs
all: $(OutputFile)

$(OutputFile): $(IntermediateDirectory)/.d $(Objects) 
	@$(MakeDirCommand) $(@D)
	@echo "" > $(IntermediateDirectory)/.d
	@echo $(Objects0)  > $(ObjectsFileList)
	$(LinkerName) $(OutputSwitch)$(OutputFile) @$(ObjectsFileList) $(LibPath) $(Libs) $(LinkOptions)

MakeIntermediateDirs:
	@$(MakeDirCommand) "./Debug"


$(IntermediateDirectory)/.d:
	@$(MakeDirCommand) "./Debug"

PreBuild:


##
## Objects
##
$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(ObjectSuffix): Aulas Praticas/AP01/Cat/Cat.c $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Cat/Cat.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(DependSuffix): Aulas Praticas/AP01/Cat/Cat.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(DependSuffix) -MM "Aulas Praticas/AP01/Cat/Cat.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(PreprocessSuffix): Aulas Praticas/AP01/Cat/Cat.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Cat.c$(PreprocessSuffix) "Aulas Praticas/AP01/Cat/Cat.c"

$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(ObjectSuffix): Aulas Praticas/AP01 After seing the solution/main.c $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01 After seing the solution/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(DependSuffix): Aulas Praticas/AP01 After seing the solution/main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(DependSuffix) -MM "Aulas Praticas/AP01 After seing the solution/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(PreprocessSuffix): Aulas Praticas/AP01 After seing the solution/main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_main.c$(PreprocessSuffix) "Aulas Praticas/AP01 After seing the solution/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(ObjectSuffix): Aulas Praticas/AP01_Testes com LIFO/main.c $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01_Testes com LIFO/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(DependSuffix): Aulas Praticas/AP01_Testes com LIFO/main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(DependSuffix) -MM "Aulas Praticas/AP01_Testes com LIFO/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(PreprocessSuffix): Aulas Praticas/AP01_Testes com LIFO/main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_main.c$(PreprocessSuffix) "Aulas Praticas/AP01_Testes com LIFO/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(ObjectSuffix): Aulas Praticas/AP01 After seing the solution/Animal.c $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01 After seing the solution/Animal.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(DependSuffix): Aulas Praticas/AP01 After seing the solution/Animal.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(DependSuffix) -MM "Aulas Praticas/AP01 After seing the solution/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(PreprocessSuffix): Aulas Praticas/AP01 After seing the solution/Animal.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01 After seing the solution_Animal.c$(PreprocessSuffix) "Aulas Praticas/AP01 After seing the solution/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(ObjectSuffix): Aulas Praticas/AP01_Testes com LIFO/Animal.c $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01_Testes com LIFO/Animal.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(DependSuffix): Aulas Praticas/AP01_Testes com LIFO/Animal.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(DependSuffix) -MM "Aulas Praticas/AP01_Testes com LIFO/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(PreprocessSuffix): Aulas Praticas/AP01_Testes com LIFO/Animal.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Testes com LIFO_Animal.c$(PreprocessSuffix) "Aulas Praticas/AP01_Testes com LIFO/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(ObjectSuffix): Aulas Praticas/AP01/Simple Cat/main.c $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Simple Cat/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(DependSuffix): Aulas Praticas/AP01/Simple Cat/main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(DependSuffix) -MM "Aulas Praticas/AP01/Simple Cat/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(PreprocessSuffix): Aulas Praticas/AP01/Simple Cat/main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_main.c$(PreprocessSuffix) "Aulas Praticas/AP01/Simple Cat/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(ObjectSuffix): Aulas Praticas/AP01/Simple Cat/Cat.c $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Simple Cat/Cat.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(DependSuffix): Aulas Praticas/AP01/Simple Cat/Cat.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(DependSuffix) -MM "Aulas Praticas/AP01/Simple Cat/Cat.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(PreprocessSuffix): Aulas Praticas/AP01/Simple Cat/Cat.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Simple Cat_Cat.c$(PreprocessSuffix) "Aulas Praticas/AP01/Simple Cat/Cat.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(ObjectSuffix): Aulas Praticas/AP01/Cat/main.c $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Cat/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(DependSuffix): Aulas Praticas/AP01/Cat/main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(DependSuffix) -MM "Aulas Praticas/AP01/Cat/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(PreprocessSuffix): Aulas Praticas/AP01/Cat/main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_main.c$(PreprocessSuffix) "Aulas Praticas/AP01/Cat/main.c"

$(IntermediateDirectory)/Aulas Praticas_test.c$(ObjectSuffix): Aulas Praticas/test.c $(IntermediateDirectory)/Aulas Praticas_test.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/test.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_test.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_test.c$(DependSuffix): Aulas Praticas/test.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_test.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_test.c$(DependSuffix) -MM "Aulas Praticas/test.c"

$(IntermediateDirectory)/Aulas Praticas_test.c$(PreprocessSuffix): Aulas Praticas/test.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_test.c$(PreprocessSuffix) "Aulas Praticas/test.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(ObjectSuffix): Aulas Praticas/AP01/Cat/Animal.c $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Cat/Animal.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(DependSuffix): Aulas Praticas/AP01/Cat/Animal.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(DependSuffix) -MM "Aulas Praticas/AP01/Cat/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(PreprocessSuffix): Aulas Praticas/AP01/Cat/Animal.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Cat_Animal.c$(PreprocessSuffix) "Aulas Praticas/AP01/Cat/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(ObjectSuffix): Aulas Praticas/AP01/Animal/Animal.c $(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Animal/Animal.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(DependSuffix): Aulas Praticas/AP01/Animal/Animal.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(DependSuffix) -MM "Aulas Praticas/AP01/Animal/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(PreprocessSuffix): Aulas Praticas/AP01/Animal/Animal.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Animal_Animal.c$(PreprocessSuffix) "Aulas Praticas/AP01/Animal/Animal.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(ObjectSuffix): Aulas Praticas/AP01/Animal/main.c $(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(DependSuffix)
	$(CC) $(SourceSwitch) "C:/Users/Ricardo/IST/PCO/Aulas Praticas/AP01/Animal/main.c" $(CFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(DependSuffix): Aulas Praticas/AP01/Animal/main.c
	@$(CC) $(CFLAGS) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(ObjectSuffix) -MF$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(DependSuffix) -MM "Aulas Praticas/AP01/Animal/main.c"

$(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(PreprocessSuffix): Aulas Praticas/AP01/Animal/main.c
	$(CC) $(CFLAGS) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Aulas Praticas_AP01_Animal_main.c$(PreprocessSuffix) "Aulas Praticas/AP01/Animal/main.c"


-include $(IntermediateDirectory)/*$(DependSuffix)
##
## Clean
##
clean:
	$(RM) -r ./Debug/


