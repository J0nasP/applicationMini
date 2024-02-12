home/jonas/school/h5/miniExam/application/android/app/src/main/AndroidManifest.xml:34:9-41:19 Error:
[        ] 	android:exported needs to be explicitly specified for element
<service#com.example.application.HceApduService>. Apps targeting Android 12 and higher are required
to specify an explicit value for `android:exported` when the corresponding component has an intent
filter defined. See https://developer.android.com/guide/topics/manifest/activity-element#exported for
details.
[        ] FAILURE: Build failed with an exception.
[        ] * What went wrong:
[        ] Execution failed for task ':app:processReleaseMainManifest'.
[        ] > Manifest merger failed : android:exported needs to be explicitly specified for element
<service#com.example.application.HceApduService>. Apps targeting Android 12 and higher are required
to specify an explicit value for `android:exported` when the corresponding component has an intent
filter defined. See https://developer.android.com/guide/topics/manifest/activity-element#exported for
details.
[        ] * Try:
[        ] > Run with --debug option to get more log output.
[        ] > Run with --scan to get full insights.
[        ] * Exception is:
[        ] org.gradle.api.tasks.TaskExecutionException: Execution failed for task
':app:processReleaseMainManifest'.
[        ] 	at
org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.lambda$executeIfValid$1(ExecuteAct
ionsTaskExecuter.java:142)
[        ] 	at org.gradle.internal.Try$Failure.ifSuccessfulOrElse(Try.java:282)
[        ] 	at
org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskE
xecuter.java:140)
[        ] 	at
org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter
.java:128)
[        ] 	at
org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecut
er.java:77)
[        ] 	at
org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTask
Executer.java:46)
[        ] 	at
org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecution
ModeExecuter.java:51)
[        ] 	at
org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsEx
ecuter.java:57)
[        ] 	at
org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:56
)
[        ] 	at
org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter
.java:36)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter
.java:77)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:5
5)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:5
2)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:204)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:199)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:66)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:59)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:1
57)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:5
9)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:
73)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:
52)
[        ] 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:69)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTas
kExecutionGraph.java:327)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTas
kExecutionGraph.java:314)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(D
efaultTaskExecutionGraph.java:307)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(D
efaultTaskExecutionGraph.java:293)
[        ] 	at
org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:417)
[        ] 	at
org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:339)
[        ] 	at
org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64
)
[        ] 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
[        ] 	at
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
[        ] 	at
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
[        ] 	at java.base/java.lang.Thread.run(Thread.java:833)
[        ] Caused by: java.lang.RuntimeException: Manifest merger failed : android:exported needs to
be explicitly specified for element <service#com.example.application.HceApduService>. Apps targeting
Android 12 and higher are required to specify an explicit value for `android:exported` when the
corresponding component has an intent filter defined. See
https://developer.android.com/guide/topics/manifest/activity-element#exported for details.
[        ] 	at
com.android.build.gradle.internal.tasks.manifest.ManifestHelperKt.mergeManifests(ManifestHelper.kt:10
0)
[        ] 	at
com.android.build.gradle.tasks.ProcessApplicationManifest.doTaskAction(ProcessApplicationManifest.kt:
158)
[        ] 	at
com.android.build.gradle.internal.tasks.NonIncrementalTask$taskAction$$inlined$recordTaskAction$1.inv
oke(BaseTask.kt:66)
[        ] 	at com.android.build.gradle.internal.tasks.Blocks.recordSpan(Blocks.java:51)
[        ] 	at
com.android.build.gradle.internal.tasks.NonIncrementalTask.taskAction(NonIncrementalTask.kt:97)
[        ] 	at jdk.internal.reflect.GeneratedMethodAccessor107.invoke(Unknown Source)
[        ] 	at
java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:
43)
[        ] 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
[        ] 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
[        ] 	at
org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
[        ] 	at
org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
[        ] 	at
org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
[        ] 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:236)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java
:29)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java
:26)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:66)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:59)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:1
57)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:5
9)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:6
8)
[        ] 	at
org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:221)
[        ] 	at
org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:204)
[        ] 	at
org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.ja
va:187)
[        ] 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:165)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:89)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:40)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:53)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:50)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:204)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:199)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:66)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:59)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:1
57)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:5
9)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:
73)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:50)
[        ] 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:40)
[        ] 	at
org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:
68)
[        ] 	at
org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:
38)
[        ] 	at
org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
[        ] 	at
org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
[        ] 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
[        ] 	at
org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:51)
[        ] 	at
org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:29)
[        ] 	at
org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges
(CaptureStateAfterExecutionStep.java:124)
[        ] 	at
org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecution
Step.java:80)
[        ] 	at
org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecution
Step.java:58)
[        ] 	at
org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:48)
[        ] 	at
org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:36)
[        ] 	at
org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:181)
[        ] 	at
org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:71)
[        ] 	at org.gradle.internal.Either$Right.fold(Either.java:175)
[        ] 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
[        ] 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:69)
[        ] 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:47)
[        ] 	at
org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
[        ] 	at
org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
[        ] 	at
org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
[        ] 	at
org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
[        ] 	at
org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:110)
[        ] 	at
org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:56)
[        ] 	at java.base/java.util.Optional.orElseGet(Optional.java:364)
[        ] 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:56)
[        ] 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:38)
[        ] 	at
org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:73)
[        ] 	at
org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:44)
[        ] 	at
org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottin
gInputsFinishedStep.java:37)
[        ] 	at
org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottin
gInputsFinishedStep.java:27)
[        ] 	at
org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:89)
[        ] 	at
org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:50)
[        ] 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:114)
[        ] 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:57)
[        ] 	at
org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecuti
onStep.java:76)
[        ] 	at
org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecuti
onStep.java:50)
[        ] 	at
org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNoEmptySources(SkipEmptyWorkStep.jav
a:254)
[        ] 	at
org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:91)
[        ] 	at
org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:56)
[        ] 	at
org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutio
nStateStep.java:32)
[        ] 	at
org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutio
nStateStep.java:21)
[        ] 	at
org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshotting
InputsStartedStep.java:38)
[        ] 	at
org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionState
Step.java:43)
[        ] 	at
org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionState
Step.java:31)
[        ] 	at
org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:40)
[        ] 	at
org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:281)
[        ] 	at
org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:40)
[        ] 	at
org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
[        ] 	at
org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
[        ] 	at
org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
[        ] 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:44)
[        ] 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:33)
[        ] 	at
org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:76)
[        ] 	at
org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskE
xecuter.java:139)
[        ] 	at
org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter
.java:128)
[        ] 	at
org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecut
er.java:77)
[        ] 	at
org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTask
Executer.java:46)
[        ] 	at
org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecution
ModeExecuter.java:51)
[        ] 	at
org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsEx
ecuter.java:57)
[        ] 	at
org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:56
)
[        ] 	at
org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter
.java:36)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter
.java:77)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:5
5)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:5
2)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:204)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(Defau
ltBuildOperationRunner.java:199)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:66)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java
:59)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:1
57)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:5
9)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
[        ] 	at
org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:
73)
[        ] 	at
org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:
52)
[        ] 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:69)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTas
kExecutionGraph.java:327)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTas
kExecutionGraph.java:314)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(D
efaultTaskExecutionGraph.java:307)
[        ] 	at
org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(D
efaultTaskExecutionGraph.java:293)
[        ] 	at
org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:417)
[        ] 	at
org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:339)
[        ] 	at
org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64
)
[        ] 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
[        ] 	at
java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
[        ] 	at
java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
[        ] 	at java.base/java.lang.Thread.run(Thread.java:833)
[        ] * Get more help at https://help.gradle.org
[        ] BUILD FAILED in 4m 17s
[ +323 ms] Running Gradle task 'assembleRelease'... (completed in 258.3s)
[  +12 ms] "flutter apk" took 1,908,641ms.
[   +9 ms] Gradle task assembleRelease failed with exit code 1
[   +1 ms] 
           #0      throwToolExit (package:flutter_tools/src/base/common.dart:10:3)
           #1      AndroidGradleBuilder.buildGradleApp
(package:flutter_tools/src/android/gradle.dart:491:9)
           <asynchronous suspension>
           #2      AndroidGradleBuilder.buildGradleApp
(package:flutter_tools/src/android/gradle.dart:512:13)
           <asynchronous suspension>
           #3      AndroidGradleBuilder.buildApk
(package:flutter_tools/src/android/gradle.dart:220:5)
           <asynchronous suspension>
           #4      BuildApkCommand.runCommand
(package:flutter_tools/src/commands/build_apk.dart:142:5)
           <asynchronous suspension>
           #5      FlutterCommand.run.<anonymous closure>
           (package:flutter_tools/src/runner/flutter_command.dart:1367:27)
           <asynchronous suspension>
           #6      AppContext.run.<anonymous closure>
(package:flutter_tools/src/base/context.dart:150:19)
           <asynchronous suspension>
           #7      CommandRunner.runCommand (package:args/command_runner.dart:212:13)
           <asynchronous suspension>
           #8      FlutterCommandRunner.runCommand.<anonymous closure>
           (package:flutter_tools/src/runner/flutter_command_runner.dart:348:9)
           <asynchronous suspension>
           #9      AppContext.run.<anonymous closure>
(package:flutter_tools/src/base/context.dart:150:19)
           <asynchronous suspension>
           #10     FlutterCommandRunner.runCommand
           (package:flutter_tools/src/runner/flutter_command_runner.dart:294:5)
           <asynchronous suspension>
           #11     run.<anonymous closure>.<anonymous closure>
(package:flutter_tools/runner.dart:112:9)
           <asynchronous suspension>
           #12     AppContext.run.<anonymous closure>
(package:flutter_tools/src/base/context.dart:150:19)
           <asynchronous suspension>
           #13     main (package:flutter_tools/executable.dart:90:3)
           <asynchronous suspension>